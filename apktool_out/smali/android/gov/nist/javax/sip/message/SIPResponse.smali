.class public Landroid/gov/nist/javax/sip/message/SIPResponse;
.super Landroid/gov/nist/javax/sip/message/SIPMessage;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/message/Response;
.implements Landroid/gov/nist/javax/sip/message/ResponseExt;


# instance fields
.field private isRetransmission:Z

.field protected statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->isRetransmission:Z

    .line 6
    .line 7
    return-void
.end method

.method public static getReasonPhrase(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x1a4

    .line 2
    .line 3
    if-eq p0, v0, :cond_3

    .line 4
    .line 5
    const/16 v0, 0x1a5

    .line 6
    .line 7
    if-eq p0, v0, :cond_2

    .line 8
    .line 9
    const/16 v0, 0x25b

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x25c

    .line 14
    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    sparse-switch p0, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    packed-switch p0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    packed-switch p0, :pswitch_data_1

    .line 24
    .line 25
    .line 26
    packed-switch p0, :pswitch_data_2

    .line 27
    .line 28
    .line 29
    packed-switch p0, :pswitch_data_3

    .line 30
    .line 31
    .line 32
    packed-switch p0, :pswitch_data_4

    .line 33
    .line 34
    .line 35
    packed-switch p0, :pswitch_data_5

    .line 36
    .line 37
    .line 38
    const-string p0, "Unknown Status"

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    const-string p0, "SIP version not supported"

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    const-string p0, "Gateway timeout"

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_2
    const-string p0, "Service unavailable"

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_3
    const-string p0, "Bad gateway"

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_4
    const-string p0, "Not implemented"

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_5
    const-string p0, "Server Internal Error"

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_6
    const-string p0, "Bad Event"

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_7
    const-string p0, "Not Acceptable here"

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_8
    const-string p0, "Request Terminated"

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_9
    const-string p0, "Busy here"

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_a
    const-string p0, "Ambiguous"

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_b
    const-string p0, "Address incomplete"

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_c
    const-string p0, "Too many hops"

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_d
    const-string p0, "Loop detected"

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_e
    const-string p0, "Call leg/Transaction does not exist"

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_f
    const-string p0, "Temporarily Unavailable"

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_10
    const-string p0, "Unsupported URI Scheme"

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_11
    const-string p0, "Unsupported media type"

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_12
    const-string p0, "Request-URI too large"

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_13
    const-string p0, "Request entity too large"

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_14
    const-string p0, "Conditional request failed"

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_15
    const-string p0, "Request timeout"

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_16
    const-string p0, "Proxy Authentication required"

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_17
    const-string p0, "Not acceptable"

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_18
    const-string p0, "Method not allowed"

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_19
    const-string p0, "Not found"

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_1a
    const-string p0, "Forbidden"

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_1b
    const-string p0, "Payment required"

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_1c
    const-string p0, "Unauthorized"

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_1d
    const-string p0, "Bad request"

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_1e
    const-string p0, "Moved Temporarily"

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_1f
    const-string p0, "Moved permanently"

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_20
    const-string p0, "Multiple choices"

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_21
    const-string p0, "Session progress"

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_22
    const-string p0, "Queued"

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_23
    const-string p0, "Call is being forwarded"

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_24
    const-string p0, "Ringing"

    .line 150
    .line 151
    return-object p0

    .line 152
    :sswitch_0
    const-string p0, "Session Not acceptable"

    .line 153
    .line 154
    return-object p0

    .line 155
    :sswitch_1
    const-string p0, "Busy everywhere"

    .line 156
    .line 157
    return-object p0

    .line 158
    :sswitch_2
    const-string p0, "Message Too Large"

    .line 159
    .line 160
    return-object p0

    .line 161
    :sswitch_3
    const-string p0, "Undecipherable"

    .line 162
    .line 163
    return-object p0

    .line 164
    :sswitch_4
    const-string p0, "Request Pending"

    .line 165
    .line 166
    return-object p0

    .line 167
    :sswitch_5
    const-string p0, "Interval too brief"

    .line 168
    .line 169
    return-object p0

    .line 170
    :sswitch_6
    const-string p0, "Gone"

    .line 171
    .line 172
    return-object p0

    .line 173
    :sswitch_7
    const-string p0, "Alternative service"

    .line 174
    .line 175
    return-object p0

    .line 176
    :sswitch_8
    const-string p0, "Use proxy"

    .line 177
    .line 178
    return-object p0

    .line 179
    :sswitch_9
    const-string p0, "Accepted"

    .line 180
    .line 181
    return-object p0

    .line 182
    :sswitch_a
    const-string p0, "OK"

    .line 183
    .line 184
    return-object p0

    .line 185
    :sswitch_b
    const-string p0, "Trying"

    .line 186
    .line 187
    return-object p0

    .line 188
    :cond_0
    const-string p0, "Does not exist anywhere"

    .line 189
    .line 190
    return-object p0

    .line 191
    :cond_1
    const-string p0, "Decline"

    .line 192
    .line 193
    return-object p0

    .line 194
    :cond_2
    const-string p0, "Etension Required"

    .line 195
    .line 196
    return-object p0

    .line 197
    :cond_3
    const-string p0, "Bad extension"

    .line 198
    .line 199
    return-object p0

    .line 200
    nop

    .line 201
    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_b
        0xc8 -> :sswitch_a
        0xca -> :sswitch_9
        0x131 -> :sswitch_8
        0x17c -> :sswitch_7
        0x19a -> :sswitch_6
        0x1a7 -> :sswitch_5
        0x1eb -> :sswitch_4
        0x1ed -> :sswitch_3
        0x201 -> :sswitch_2
        0x258 -> :sswitch_1
        0x25e -> :sswitch_0
    .end sparse-switch

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    :pswitch_data_0
    .packed-switch 0xb4
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
    .end packed-switch

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    :pswitch_data_1
    .packed-switch 0x12c
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    :pswitch_data_2
    .packed-switch 0x190
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    :pswitch_data_3
    .packed-switch 0x19c
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    :pswitch_data_4
    .packed-switch 0x1e0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    :pswitch_data_5
    .packed-switch 0x1f4
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static isFinalResponse(I)Z
    .locals 1

    .line 1
    const/16 v0, 0xc8

    if-lt p0, v0, :cond_0

    const/16 v0, 0x2bc

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public checkHeaders()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/16 v2, 0x2bb

    .line 37
    .line 38
    if-gt v0, v2, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance v0, Ljava/text/ParseException;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->getStatusCode()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v3, "Unknown error code!"

    .line 50
    .line 51
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-direct {v0, p0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_1
    const-string p0, "Call-ID Is missing "

    .line 66
    .line 67
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    const-string p0, "Via Is missing "

    .line 72
    .line 73
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    const-string p0, "From Is missing "

    .line 78
    .line 79
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    const-string p0, "To Is missing "

    .line 84
    .line 85
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_5
    const-string p0, "CSeq Is missing "

    .line 90
    .line 91
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public cleanUp()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->cleanUp()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public debugDump()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->debugDump()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    iput-object v1, p0, Landroid/gov/nist/core/GenericObject;->stringRepresentation:Ljava/lang/String;

    .line 8
    .line 9
    const-class v1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "{"

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/SIPObject;->debugDump()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p0, v1}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "}"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/GenericObject;->sprint(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Landroid/gov/nist/core/GenericObject;->stringRepresentation:Ljava/lang/String;

    .line 43
    .line 44
    return-object p0
.end method

.method public encode()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/StatusLine;->encode()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encode()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encode()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public encodeAsBytes(Ljava/lang/String;)[B
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/StatusLine;->encode()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "UTF-8"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encodeAsBytes(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    array-length p1, v0

    .line 26
    array-length v1, p0

    .line 27
    add-int/2addr p1, v1

    .line 28
    new-array p1, p1, [B

    .line 29
    .line 30
    array-length v1, v0

    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    array-length v0, v0

    .line 36
    array-length v1, p0

    .line 37
    invoke-static {p0, v2, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    return-object p1
.end method

.method public encodeMessage(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/SIPObject;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encodeSIPHeaders(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encodeSIPHeaders(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    move-object v0, p1

    .line 18
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 19
    .line 20
    iget-object v2, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 21
    .line 22
    iget-object v0, v0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/header/SIPObject;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_1
    return v1
.end method

.method public getFirstLine()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/StatusLine;->encode()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getMessageAsEncodedStrings()Ljava/util/LinkedList;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getMessageAsEncodedStrings()Ljava/util/LinkedList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/StatusLine;->encode()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public getReasonPhrase()Ljava/lang/String;
    .locals 1

    .line 201
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 203
    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public getSIPVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/StatusLine;->getSipVersion()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getStatusCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/StatusLine;->getStatusCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getStatusLine()Landroid/gov/nist/javax/sip/header/StatusLine;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    return-object p0
.end method

.method public isFinalResponse()Z
    .locals 0

    .line 2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/StatusLine;->getStatusCode()I

    move-result p0

    invoke-static {p0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->isFinalResponse(I)Z

    move-result p0

    return p0
.end method

.method public isRetransmission()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->isRetransmission:Z

    .line 2
    .line 3
    return p0
.end method

.method public match(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    if-ne p1, p0, :cond_2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_2
    move-object v1, p1

    .line 25
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 26
    .line 27
    iget-object v1, v1, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 28
    .line 29
    iget-object v3, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 30
    .line 31
    if-nez v3, :cond_3

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    return v2

    .line 36
    :cond_3
    if-ne v3, v1, :cond_4

    .line 37
    .line 38
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->match(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_4
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/header/StatusLine;->match(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_5

    .line 48
    .line 49
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->match(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_5

    .line 54
    .line 55
    return v0

    .line 56
    :cond_5
    return v2
.end method

.method public setReasonPhrase(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/StatusLine;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/StatusLine;->setReasonPhrase(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "Bad reason phrase"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setRetransmission(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->isRetransmission:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSIPVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/StatusLine;->setSipVersion(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setStatusCode(I)V
    .locals 1

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x2bb

    .line 6
    .line 7
    if-gt p1, v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/StatusLine;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/StatusLine;->setStatusCode(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string p0, "bad status code"

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-static {p1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public setStatusLine(Landroid/gov/nist/javax/sip/header/StatusLine;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p0, ""

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroid/gov/nist/javax/sip/message/SIPResponse;->statusLine:Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/StatusLine;->encode()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-super {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encode()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method
