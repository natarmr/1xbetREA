.class public Landroid/gov/nist/javax/sip/parser/ViaParser;
.super Landroid/gov/nist/javax/sip/parser/HeaderParser;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/HeaderParser;-><init>(Landroid/gov/nist/javax/sip/parser/Lexer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/HeaderParser;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private parseVia(Landroid/gov/nist/javax/sip/header/Via;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 2
    .line 3
    const/16 v1, 0xfff

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 20
    .line 21
    const/16 v3, 0x2f

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 48
    .line 49
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 50
    .line 51
    .line 52
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 53
    .line 54
    invoke-virtual {v4, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 58
    .line 59
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 60
    .line 61
    .line 62
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 63
    .line 64
    invoke-virtual {v3, v1}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 81
    .line 82
    .line 83
    new-instance v3, Landroid/gov/nist/javax/sip/header/Protocol;

    .line 84
    .line 85
    invoke-direct {v3}, Landroid/gov/nist/javax/sip/header/Protocol;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/header/Protocol;->setProtocolName(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/header/Protocol;->setProtocolVersion(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/header/Protocol;->setTransport(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/header/Via;->setSentProtocol(Landroid/gov/nist/javax/sip/header/Protocol;)V

    .line 110
    .line 111
    .line 112
    new-instance v0, Landroid/gov/nist/core/HostNameParser;

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/Parser;->getLexer()Landroid/gov/nist/javax/sip/parser/Lexer;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-direct {v0, v1}, Landroid/gov/nist/core/HostNameParser;-><init>(Landroid/gov/nist/core/LexerCore;)V

    .line 119
    .line 120
    .line 121
    const/4 v1, 0x1

    .line 122
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/HostNameParser;->hostPort(Z)Landroid/gov/nist/core/HostPort;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/header/Via;->setSentBy(Landroid/gov/nist/core/HostPort;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 130
    .line 131
    invoke-virtual {v0}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 132
    .line 133
    .line 134
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    invoke-virtual {v0, v2}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 142
    .line 143
    const/16 v4, 0x3b

    .line 144
    .line 145
    if-ne v0, v4, :cond_2

    .line 146
    .line 147
    invoke-virtual {v3, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/ViaParser;->nameValue()Landroid/gov/nist/core/NameValue;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const-string v3, "branch"

    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_1

    .line 170
    .line 171
    invoke-virtual {v0}, Landroid/gov/nist/core/NameValue;->getValueAsObject()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, Ljava/lang/String;

    .line 176
    .line 177
    if-eqz v2, :cond_0

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 181
    .line 182
    invoke-virtual {p0}, Landroid/gov/nist/core/LexerCore;->getPtr()I

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    const-string p1, "null branch Id"

    .line 187
    .line 188
    invoke-static {p0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_1
    :goto_1
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Landroid/gov/nist/core/NameValue;)V

    .line 193
    .line 194
    .line 195
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 198
    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_2
    invoke-virtual {v3, v2}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    const/16 v3, 0x28

    .line 206
    .line 207
    if-ne v0, v3, :cond_6

    .line 208
    .line 209
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 210
    .line 211
    const-string v3, "charLexer"

    .line 212
    .line 213
    invoke-virtual {v0, v3}, Landroid/gov/nist/core/LexerCore;->selectLexer(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    iget-object v0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 219
    .line 220
    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    :goto_2
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 227
    .line 228
    invoke-virtual {v3, v2}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    const/16 v4, 0x29

    .line 233
    .line 234
    if-ne v3, v4, :cond_3

    .line 235
    .line 236
    iget-object p0, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 237
    .line 238
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_3
    const/16 v4, 0x5c

    .line 243
    .line 244
    if-ne v3, v4, :cond_4

    .line 245
    .line 246
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 247
    .line 248
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v3}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 260
    .line 261
    invoke-virtual {v3, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 262
    .line 263
    .line 264
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 265
    .line 266
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v3}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 278
    .line 279
    invoke-virtual {v3, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_4
    const/16 v4, 0xa

    .line 284
    .line 285
    if-ne v3, v4, :cond_5

    .line 286
    .line 287
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-virtual {p1, p0}, Landroid/gov/nist/javax/sip/header/Via;->setComment(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 299
    .line 300
    invoke-virtual {v3, v1}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 301
    .line 302
    .line 303
    goto :goto_2

    .line 304
    :cond_6
    return-void
.end method


# virtual methods
.method public nameValue()Landroid/gov/nist/core/NameValue;
    .locals 10

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "nameValue"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 11
    .line 12
    const/16 v3, 0xfff

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v4, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/gov/nist/core/LexerCore;->SPorHT()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    :try_start_1
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-virtual {v5, v6}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/16 v7, 0x3d

    .line 37
    .line 38
    if-ne v5, v7, :cond_5

    .line 39
    .line 40
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    invoke-virtual {v5, v7}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 44
    .line 45
    .line 46
    iget-object v5, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 47
    .line 48
    invoke-virtual {v5}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const-string v8, "received"

    .line 56
    .line 57
    invoke-virtual {v5, v8}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v5
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    iget-object v8, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 62
    .line 63
    if-nez v5, :cond_1

    .line 64
    .line 65
    :try_start_2
    invoke-virtual {v8}, Landroid/gov/nist/core/LexerCore;->byteStringNoSemicolon()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v8, v6}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 73
    .line 74
    .line 75
    move-result v5
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    iget-object v8, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 77
    .line 78
    const/16 v9, 0x22

    .line 79
    .line 80
    if-ne v5, v9, :cond_2

    .line 81
    .line 82
    :try_start_3
    invoke-virtual {v8}, Landroid/gov/nist/core/LexerCore;->quotedString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    move v6, v7

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    invoke-virtual {v8, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 89
    .line 90
    .line 91
    iget-object v3, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/gov/nist/core/LexerCore;->getNextToken()Landroid/gov/nist/core/Token;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    :goto_0
    new-instance v5, Landroid/gov/nist/core/NameValue;

    .line 102
    .line 103
    invoke-virtual {v2}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-direct {v5, v7, v3}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    if-eqz v6, :cond_3

    .line 115
    .line 116
    invoke-virtual {v5}, Landroid/gov/nist/core/NameValue;->setQuotedValue()V
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 117
    .line 118
    .line 119
    :cond_3
    if-eqz v0, :cond_4

    .line 120
    .line 121
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_4
    return-object v5

    .line 125
    :cond_5
    :try_start_4
    new-instance v3, Landroid/gov/nist/core/NameValue;

    .line 126
    .line 127
    invoke-virtual {v2}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-direct {v3, v5, v4}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/text/ParseException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 136
    .line 137
    .line 138
    if-eqz v0, :cond_6

    .line 139
    .line 140
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    return-object v3

    .line 144
    :catch_0
    :try_start_5
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 145
    .line 146
    invoke-virtual {v2}, Landroid/gov/nist/core/Token;->getTokenValue()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-direct {v0, v2, v4}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 151
    .line 152
    .line 153
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 154
    .line 155
    if-eqz v2, :cond_7

    .line 156
    .line 157
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    return-object v0

    .line 161
    :goto_1
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 162
    .line 163
    if-eqz v2, :cond_8

    .line 164
    .line 165
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :cond_8
    throw v0
.end method

.method public parse()Landroid/gov/nist/javax/sip/header/SIPHeader;
    .locals 5

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 2
    .line 3
    const-string v1, "parse"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_enter(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/header/ViaList;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/ViaList;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 16
    .line 17
    const/16 v3, 0x810

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 28
    .line 29
    const/16 v3, 0x3a

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 37
    .line 38
    .line 39
    :cond_1
    new-instance v2, Landroid/gov/nist/javax/sip/header/Via;

    .line 40
    .line 41
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/header/Via;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v2}, Landroid/gov/nist/javax/sip/parser/ViaParser;->parseVia(Landroid/gov/nist/javax/sip/header/Via;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/16 v4, 0x2c

    .line 63
    .line 64
    if-ne v2, v4, :cond_2

    .line 65
    .line 66
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    invoke-virtual {v2, v4}, Landroid/gov/nist/core/StringTokenizer;->consume(I)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/gov/nist/core/LexerCore;->SPorHT()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/StringTokenizer;->lookAhead(I)C

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const/16 v3, 0xa

    .line 87
    .line 88
    if-ne v2, v3, :cond_1

    .line 89
    .line 90
    iget-object v2, p0, Landroid/gov/nist/core/ParserCore;->lexer:Landroid/gov/nist/core/LexerCore;

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/LexerCore;->match(I)Landroid/gov/nist/core/Token;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 96
    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    return-object v0

    .line 103
    :goto_1
    sget-boolean v2, Landroid/gov/nist/core/ParserCore;->debug:Z

    .line 104
    .line 105
    if-eqz v2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/ParserCore;->dbg_leave(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    throw v0
.end method
