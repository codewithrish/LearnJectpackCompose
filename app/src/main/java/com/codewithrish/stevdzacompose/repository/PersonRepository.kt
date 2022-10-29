package com.codewithrish.stevdzacompose.repository

import com.codewithrish.stevdzacompose.data.PersonDao
import javax.inject.Inject

class PersonRepository @Inject constructor(
    private val personDao: PersonDao
) {
    val readAll = personDao.readAll()
}