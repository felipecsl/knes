package com.felipecsl.android.nes.mappers

class MMC1 : Mapper  {
  override fun write(address: Int, value: Int) {
  }

  override fun step() {
  }

  override fun read(address: Int): Int {
    throw NotImplementedError()
  }
}