.class public final La/erw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/erw0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/internal/GetServiceRequest;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, La/q5x;->p0(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->a:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->b:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->c:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v3, v1}, La/q5x;->k0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    iget-object v2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->e:Landroid/os/IBinder;

    .line 42
    .line 43
    invoke-static {p1, v1, v2}, La/q5x;->g0(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x6

    .line 47
    iget-object v2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->f:[Lcom/google/android/gms/common/api/Scope;

    .line 48
    .line 49
    invoke-static {p1, v1, v2, p2}, La/q5x;->m0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    iget-object v2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->g:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-static {p1, v1, v2}, La/q5x;->d0(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x8

    .line 59
    .line 60
    iget-object v2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->h:Landroid/accounts/Account;

    .line 61
    .line 62
    invoke-static {p1, v1, v2, p2}, La/q5x;->j0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 63
    .line 64
    .line 65
    const/16 v1, 0xa

    .line 66
    .line 67
    iget-object v2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->i:[Lcom/google/android/gms/common/Feature;

    .line 68
    .line 69
    invoke-static {p1, v1, v2, p2}, La/q5x;->m0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0xb

    .line 73
    .line 74
    iget-object v2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->j:[Lcom/google/android/gms/common/Feature;

    .line 75
    .line 76
    invoke-static {p1, v1, v2, p2}, La/q5x;->m0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 77
    .line 78
    .line 79
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->k:Z

    .line 80
    .line 81
    const/16 v1, 0xc

    .line 82
    .line 83
    invoke-static {p1, v1, v3}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    iget p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->l:I

    .line 90
    .line 91
    const/16 v1, 0xd

    .line 92
    .line 93
    invoke-static {p1, v1, v3}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->m:Z

    .line 100
    .line 101
    const/16 v1, 0xe

    .line 102
    .line 103
    invoke-static {p1, v1, v3}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    const/16 p2, 0xf

    .line 110
    .line 111
    iget-object p0, p0, Lcom/google/android/gms/common/internal/GetServiceRequest;->n:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {p1, p2, p0}, La/q5x;->k0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v0}, La/q5x;->q0(Landroid/os/Parcel;I)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public static b(Lcom/google/android/gms/measurement/internal/zzpl;Landroid/os/Parcel;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/gms/measurement/internal/zzpl;->a:I

    .line 2
    .line 3
    const/16 v1, 0x4f45

    .line 4
    .line 5
    invoke-static {p1, v1}, La/q5x;->p0(Landroid/os/Parcel;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzpl;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1, v0, v2}, La/q5x;->k0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/zzpl;->c:J

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    const/16 v2, 0x8

    .line 27
    .line 28
    invoke-static {p1, v0, v2}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzpl;->d:Ljava/lang/Long;

    .line 35
    .line 36
    invoke-static {p1, v3, v0}, La/q5x;->i0(Landroid/os/Parcel;ILjava/lang/Long;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x6

    .line 40
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzpl;->e:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p1, v0, v3}, La/q5x;->k0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x7

    .line 46
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzpl;->f:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1, v0, v3}, La/q5x;->k0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzpl;->g:Ljava/lang/Double;

    .line 52
    .line 53
    if-nez p0, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {p1, v2, v2}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeDouble(D)V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-static {p1, v1}, La/q5x;->q0(Landroid/os/Parcel;I)V

    .line 67
    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/erw0;->a:B

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    const/4 v3, 0x5

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    const/4 v6, 0x4

    .line 13
    const/4 v7, 0x3

    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x2

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    move v2, v10

    .line 26
    move-object v3, v11

    .line 27
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ge v4, v0, :cond_4

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    int-to-char v5, v4

    .line 38
    if-eq v5, v8, :cond_3

    .line 39
    .line 40
    if-eq v5, v9, :cond_2

    .line 41
    .line 42
    if-eq v5, v7, :cond_1

    .line 43
    .line 44
    if-eq v5, v6, :cond_0

    .line 45
    .line 46
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {v1, v4}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {v1, v4}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-static {v1, v4}, La/b5x;->V(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lcom/google/android/gms/common/zzt;

    .line 74
    .line 75
    invoke-direct {v0, v11, v3, v10, v2}, Lcom/google/android/gms/common/zzt;-><init>(Ljava/lang/String;Landroid/os/IBinder;ZZ)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_0
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const-string v2, ""

    .line 84
    .line 85
    const/16 v3, 0x64

    .line 86
    .line 87
    const-wide/32 v6, -0x80000000

    .line 88
    .line 89
    .line 90
    move-object/from16 v36, v2

    .line 91
    .line 92
    move-object/from16 v37, v36

    .line 93
    .line 94
    move-object/from16 v43, v37

    .line 95
    .line 96
    move-object/from16 v48, v43

    .line 97
    .line 98
    move/from16 v42, v3

    .line 99
    .line 100
    move-wide/from16 v17, v4

    .line 101
    .line 102
    move-wide/from16 v19, v17

    .line 103
    .line 104
    move-wide/from16 v27, v19

    .line 105
    .line 106
    move-wide/from16 v33, v27

    .line 107
    .line 108
    move-wide/from16 v40, v33

    .line 109
    .line 110
    move-wide/from16 v45, v40

    .line 111
    .line 112
    move-wide/from16 v49, v45

    .line 113
    .line 114
    move-wide/from16 v52, v49

    .line 115
    .line 116
    move-wide/from16 v24, v6

    .line 117
    .line 118
    move/from16 v22, v8

    .line 119
    .line 120
    move/from16 v30, v22

    .line 121
    .line 122
    move/from16 v23, v10

    .line 123
    .line 124
    move/from16 v29, v23

    .line 125
    .line 126
    move/from16 v31, v29

    .line 127
    .line 128
    move/from16 v39, v31

    .line 129
    .line 130
    move/from16 v44, v39

    .line 131
    .line 132
    move/from16 v51, v44

    .line 133
    .line 134
    move-object v13, v11

    .line 135
    move-object v14, v13

    .line 136
    move-object v15, v14

    .line 137
    move-object/from16 v16, v15

    .line 138
    .line 139
    move-object/from16 v21, v16

    .line 140
    .line 141
    move-object/from16 v26, v21

    .line 142
    .line 143
    move-object/from16 v32, v26

    .line 144
    .line 145
    move-object/from16 v35, v32

    .line 146
    .line 147
    move-object/from16 v38, v35

    .line 148
    .line 149
    move-object/from16 v47, v38

    .line 150
    .line 151
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-ge v2, v0, :cond_5

    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    int-to-char v3, v2

    .line 162
    packed-switch v3, :pswitch_data_1

    .line 163
    .line 164
    .line 165
    :pswitch_1
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :pswitch_2
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 170
    .line 171
    .line 172
    move-result-wide v2

    .line 173
    move-wide/from16 v52, v2

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :pswitch_3
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    move/from16 v51, v2

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :pswitch_4
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    move-wide/from16 v49, v2

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :pswitch_5
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    move-object/from16 v48, v2

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :pswitch_6
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    move-object/from16 v47, v2

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :pswitch_7
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 205
    .line 206
    .line 207
    move-result-wide v2

    .line 208
    move-wide/from16 v45, v2

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :pswitch_8
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    move/from16 v44, v2

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :pswitch_9
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    move-object/from16 v43, v2

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :pswitch_a
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    move/from16 v42, v2

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :pswitch_b
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 233
    .line 234
    .line 235
    move-result-wide v2

    .line 236
    move-wide/from16 v40, v2

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :pswitch_c
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    move/from16 v39, v2

    .line 244
    .line 245
    goto :goto_1

    .line 246
    :pswitch_d
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    move-object/from16 v38, v2

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :pswitch_e
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    move-object/from16 v37, v2

    .line 258
    .line 259
    goto :goto_1

    .line 260
    :pswitch_f
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    move-object/from16 v36, v2

    .line 265
    .line 266
    goto :goto_1

    .line 267
    :pswitch_10
    invoke-static {v1, v2}, La/b5x;->E(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    move-object/from16 v35, v2

    .line 272
    .line 273
    goto :goto_1

    .line 274
    :pswitch_11
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 275
    .line 276
    .line 277
    move-result-wide v2

    .line 278
    move-wide/from16 v33, v2

    .line 279
    .line 280
    goto/16 :goto_1

    .line 281
    .line 282
    :pswitch_12
    invoke-static {v1, v2}, La/b5x;->U(Landroid/os/Parcel;I)Ljava/lang/Boolean;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    move-object/from16 v32, v2

    .line 287
    .line 288
    goto/16 :goto_1

    .line 289
    .line 290
    :pswitch_13
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    move/from16 v31, v2

    .line 295
    .line 296
    goto/16 :goto_1

    .line 297
    .line 298
    :pswitch_14
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    move/from16 v30, v2

    .line 303
    .line 304
    goto/16 :goto_1

    .line 305
    .line 306
    :pswitch_15
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    move/from16 v29, v2

    .line 311
    .line 312
    goto/16 :goto_1

    .line 313
    .line 314
    :pswitch_16
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v2

    .line 318
    move-wide/from16 v27, v2

    .line 319
    .line 320
    goto/16 :goto_1

    .line 321
    .line 322
    :pswitch_17
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    move-object/from16 v26, v2

    .line 327
    .line 328
    goto/16 :goto_1

    .line 329
    .line 330
    :pswitch_18
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 331
    .line 332
    .line 333
    move-result-wide v2

    .line 334
    move-wide/from16 v24, v2

    .line 335
    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :pswitch_19
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    move/from16 v23, v2

    .line 343
    .line 344
    goto/16 :goto_1

    .line 345
    .line 346
    :pswitch_1a
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    move/from16 v22, v2

    .line 351
    .line 352
    goto/16 :goto_1

    .line 353
    .line 354
    :pswitch_1b
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    move-object/from16 v21, v2

    .line 359
    .line 360
    goto/16 :goto_1

    .line 361
    .line 362
    :pswitch_1c
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 363
    .line 364
    .line 365
    move-result-wide v2

    .line 366
    move-wide/from16 v19, v2

    .line 367
    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :pswitch_1d
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 371
    .line 372
    .line 373
    move-result-wide v2

    .line 374
    move-wide/from16 v17, v2

    .line 375
    .line 376
    goto/16 :goto_1

    .line 377
    .line 378
    :pswitch_1e
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    move-object/from16 v16, v2

    .line 383
    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :pswitch_1f
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    move-object v15, v2

    .line 391
    goto/16 :goto_1

    .line 392
    .line 393
    :pswitch_20
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    move-object v14, v2

    .line 398
    goto/16 :goto_1

    .line 399
    .line 400
    :pswitch_21
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    move-object v13, v2

    .line 405
    goto/16 :goto_1

    .line 406
    .line 407
    :cond_5
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 408
    .line 409
    .line 410
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzr;

    .line 411
    .line 412
    invoke-direct/range {v12 .. v53}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZZJLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JIJ)V

    .line 413
    .line 414
    .line 415
    return-object v12

    .line 416
    :pswitch_22
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    const-wide/16 v4, -0x1

    .line 421
    .line 422
    move-wide v15, v4

    .line 423
    move v13, v10

    .line 424
    move v14, v13

    .line 425
    move/from16 v18, v14

    .line 426
    .line 427
    move-object/from16 v17, v11

    .line 428
    .line 429
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    if-ge v2, v0, :cond_b

    .line 434
    .line 435
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    int-to-char v4, v2

    .line 440
    if-eq v4, v8, :cond_a

    .line 441
    .line 442
    if-eq v4, v9, :cond_9

    .line 443
    .line 444
    if-eq v4, v7, :cond_8

    .line 445
    .line 446
    if-eq v4, v6, :cond_7

    .line 447
    .line 448
    if-eq v4, v3, :cond_6

    .line 449
    .line 450
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 451
    .line 452
    .line 453
    goto :goto_2

    .line 454
    :cond_6
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 455
    .line 456
    .line 457
    move-result-wide v4

    .line 458
    move-wide v15, v4

    .line 459
    goto :goto_2

    .line 460
    :cond_7
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    move v14, v2

    .line 465
    goto :goto_2

    .line 466
    :cond_8
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    move v13, v2

    .line 471
    goto :goto_2

    .line 472
    :cond_9
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    move-object/from16 v17, v2

    .line 477
    .line 478
    goto :goto_2

    .line 479
    :cond_a
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    move/from16 v18, v2

    .line 484
    .line 485
    goto :goto_2

    .line 486
    :cond_b
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 487
    .line 488
    .line 489
    new-instance v12, Lcom/google/android/gms/common/zzr;

    .line 490
    .line 491
    invoke-direct/range {v12 .. v18}, Lcom/google/android/gms/common/zzr;-><init>(IIJLjava/lang/String;Z)V

    .line 492
    .line 493
    .line 494
    return-object v12

    .line 495
    :pswitch_23
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    move v3, v10

    .line 500
    move v4, v3

    .line 501
    move v6, v4

    .line 502
    move v7, v6

    .line 503
    move v8, v7

    .line 504
    move-object v2, v11

    .line 505
    move-object v5, v2

    .line 506
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 507
    .line 508
    .line 509
    move-result v9

    .line 510
    if-ge v9, v0, :cond_c

    .line 511
    .line 512
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 513
    .line 514
    .line 515
    move-result v9

    .line 516
    int-to-char v10, v9

    .line 517
    packed-switch v10, :pswitch_data_2

    .line 518
    .line 519
    .line 520
    :pswitch_24
    invoke-static {v1, v9}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 521
    .line 522
    .line 523
    goto :goto_3

    .line 524
    :pswitch_25
    invoke-static {v1, v9}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 525
    .line 526
    .line 527
    move-result v8

    .line 528
    goto :goto_3

    .line 529
    :pswitch_26
    invoke-static {v1, v9}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 530
    .line 531
    .line 532
    move-result v7

    .line 533
    goto :goto_3

    .line 534
    :pswitch_27
    invoke-static {v1, v9}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 535
    .line 536
    .line 537
    move-result v6

    .line 538
    goto :goto_3

    .line 539
    :pswitch_28
    invoke-static {v1, v9}, La/b5x;->V(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    goto :goto_3

    .line 544
    :pswitch_29
    invoke-static {v1, v9}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    goto :goto_3

    .line 549
    :pswitch_2a
    invoke-static {v1, v9}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    goto :goto_3

    .line 554
    :pswitch_2b
    invoke-static {v1, v9}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    goto :goto_3

    .line 559
    :cond_c
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 560
    .line 561
    .line 562
    new-instance v1, Lcom/google/android/gms/common/zzp;

    .line 563
    .line 564
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/common/zzp;-><init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZZ)V

    .line 565
    .line 566
    .line 567
    return-object v1

    .line 568
    :pswitch_2c
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    move-wide v15, v4

    .line 573
    move v13, v10

    .line 574
    move-object v14, v11

    .line 575
    move-object/from16 v17, v14

    .line 576
    .line 577
    move-object/from16 v18, v17

    .line 578
    .line 579
    move-object/from16 v19, v18

    .line 580
    .line 581
    move-object/from16 v20, v19

    .line 582
    .line 583
    move-object/from16 v21, v20

    .line 584
    .line 585
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 586
    .line 587
    .line 588
    move-result v3

    .line 589
    if-ge v3, v0, :cond_f

    .line 590
    .line 591
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    int-to-char v4, v3

    .line 596
    packed-switch v4, :pswitch_data_3

    .line 597
    .line 598
    .line 599
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 600
    .line 601
    .line 602
    goto :goto_4

    .line 603
    :pswitch_2d
    invoke-static {v1, v3}, La/b5x;->Z(Landroid/os/Parcel;I)I

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    if-nez v3, :cond_d

    .line 608
    .line 609
    move-object/from16 v21, v11

    .line 610
    .line 611
    goto :goto_4

    .line 612
    :cond_d
    invoke-static {v1, v3, v2}, La/b5x;->k0(Landroid/os/Parcel;II)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 616
    .line 617
    .line 618
    move-result-wide v3

    .line 619
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    move-object/from16 v21, v3

    .line 624
    .line 625
    goto :goto_4

    .line 626
    :pswitch_2e
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v20

    .line 630
    goto :goto_4

    .line 631
    :pswitch_2f
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v19

    .line 635
    goto :goto_4

    .line 636
    :pswitch_30
    invoke-static {v1, v3}, La/b5x;->Z(Landroid/os/Parcel;I)I

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    if-nez v3, :cond_e

    .line 641
    .line 642
    move-object/from16 v18, v11

    .line 643
    .line 644
    goto :goto_4

    .line 645
    :cond_e
    invoke-static {v1, v3, v6}, La/b5x;->k0(Landroid/os/Parcel;II)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    move-object/from16 v18, v3

    .line 657
    .line 658
    goto :goto_4

    .line 659
    :pswitch_31
    invoke-static {v1, v3}, La/b5x;->Y(Landroid/os/Parcel;I)Ljava/lang/Long;

    .line 660
    .line 661
    .line 662
    move-result-object v17

    .line 663
    goto :goto_4

    .line 664
    :pswitch_32
    invoke-static {v1, v3}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 665
    .line 666
    .line 667
    move-result-wide v3

    .line 668
    move-wide v15, v3

    .line 669
    goto :goto_4

    .line 670
    :pswitch_33
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v14

    .line 674
    goto :goto_4

    .line 675
    :pswitch_34
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    move v13, v3

    .line 680
    goto :goto_4

    .line 681
    :cond_f
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 682
    .line 683
    .line 684
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzpl;

    .line 685
    .line 686
    invoke-direct/range {v12 .. v21}, Lcom/google/android/gms/measurement/internal/zzpl;-><init>(ILjava/lang/String;JLjava/lang/Long;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    .line 687
    .line 688
    .line 689
    return-object v12

    .line 690
    :pswitch_35
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 695
    .line 696
    .line 697
    move-result v2

    .line 698
    if-ge v2, v0, :cond_11

    .line 699
    .line 700
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 701
    .line 702
    .line 703
    move-result v2

    .line 704
    int-to-char v3, v2

    .line 705
    if-eq v3, v8, :cond_10

    .line 706
    .line 707
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 708
    .line 709
    .line 710
    goto :goto_5

    .line 711
    :cond_10
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzom;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 712
    .line 713
    invoke-static {v1, v2, v3}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 714
    .line 715
    .line 716
    move-result-object v11

    .line 717
    goto :goto_5

    .line 718
    :cond_11
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 719
    .line 720
    .line 721
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzoq;

    .line 722
    .line 723
    invoke-direct {v0, v11}, Lcom/google/android/gms/measurement/internal/zzoq;-><init>(Ljava/util/ArrayList;)V

    .line 724
    .line 725
    .line 726
    return-object v0

    .line 727
    :pswitch_36
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    :goto_6
    move-object v2, v11

    .line 732
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 733
    .line 734
    .line 735
    move-result v3

    .line 736
    if-ge v3, v0, :cond_15

    .line 737
    .line 738
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 739
    .line 740
    .line 741
    move-result v3

    .line 742
    int-to-char v4, v3

    .line 743
    if-eq v4, v8, :cond_12

    .line 744
    .line 745
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 746
    .line 747
    .line 748
    goto :goto_7

    .line 749
    :cond_12
    invoke-static {v1, v3}, La/b5x;->Z(Landroid/os/Parcel;I)I

    .line 750
    .line 751
    .line 752
    move-result v2

    .line 753
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    if-nez v2, :cond_13

    .line 758
    .line 759
    goto :goto_6

    .line 760
    :cond_13
    new-instance v4, Ljava/util/ArrayList;

    .line 761
    .line 762
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 766
    .line 767
    .line 768
    move-result v5

    .line 769
    move v6, v10

    .line 770
    :goto_8
    if-ge v6, v5, :cond_14

    .line 771
    .line 772
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 773
    .line 774
    .line 775
    move-result v7

    .line 776
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 777
    .line 778
    .line 779
    move-result-object v7

    .line 780
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    add-int/lit8 v6, v6, 0x1

    .line 784
    .line 785
    goto :goto_8

    .line 786
    :cond_14
    add-int/2addr v3, v2

    .line 787
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 788
    .line 789
    .line 790
    move-object v2, v4

    .line 791
    goto :goto_7

    .line 792
    :cond_15
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 793
    .line 794
    .line 795
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzoo;

    .line 796
    .line 797
    invoke-direct {v0, v2}, Lcom/google/android/gms/measurement/internal/zzoo;-><init>(Ljava/util/ArrayList;)V

    .line 798
    .line 799
    .line 800
    return-object v0

    .line 801
    :pswitch_37
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 802
    .line 803
    .line 804
    move-result v0

    .line 805
    move-wide v13, v4

    .line 806
    move-wide/from16 v19, v13

    .line 807
    .line 808
    move/from16 v18, v10

    .line 809
    .line 810
    move-object v15, v11

    .line 811
    move-object/from16 v16, v15

    .line 812
    .line 813
    move-object/from16 v17, v16

    .line 814
    .line 815
    move-object/from16 v21, v17

    .line 816
    .line 817
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 818
    .line 819
    .line 820
    move-result v2

    .line 821
    if-ge v2, v0, :cond_16

    .line 822
    .line 823
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 824
    .line 825
    .line 826
    move-result v2

    .line 827
    int-to-char v3, v2

    .line 828
    packed-switch v3, :pswitch_data_4

    .line 829
    .line 830
    .line 831
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 832
    .line 833
    .line 834
    goto :goto_9

    .line 835
    :pswitch_38
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    move-object/from16 v21, v2

    .line 840
    .line 841
    goto :goto_9

    .line 842
    :pswitch_39
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 843
    .line 844
    .line 845
    move-result-wide v2

    .line 846
    move-wide/from16 v19, v2

    .line 847
    .line 848
    goto :goto_9

    .line 849
    :pswitch_3a
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    move/from16 v18, v2

    .line 854
    .line 855
    goto :goto_9

    .line 856
    :pswitch_3b
    invoke-static {v1, v2}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 857
    .line 858
    .line 859
    move-result-object v2

    .line 860
    move-object/from16 v17, v2

    .line 861
    .line 862
    goto :goto_9

    .line 863
    :pswitch_3c
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v2

    .line 867
    move-object/from16 v16, v2

    .line 868
    .line 869
    goto :goto_9

    .line 870
    :pswitch_3d
    invoke-static {v1, v2}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    move-object v15, v2

    .line 875
    goto :goto_9

    .line 876
    :pswitch_3e
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 877
    .line 878
    .line 879
    move-result-wide v2

    .line 880
    move-wide v13, v2

    .line 881
    goto :goto_9

    .line 882
    :cond_16
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 883
    .line 884
    .line 885
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzom;

    .line 886
    .line 887
    invoke-direct/range {v12 .. v21}, Lcom/google/android/gms/measurement/internal/zzom;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    .line 888
    .line 889
    .line 890
    return-object v12

    .line 891
    :pswitch_3f
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 896
    .line 897
    .line 898
    move-result v2

    .line 899
    if-ge v2, v0, :cond_1a

    .line 900
    .line 901
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    int-to-char v3, v2

    .line 906
    if-eq v3, v8, :cond_19

    .line 907
    .line 908
    if-eq v3, v9, :cond_18

    .line 909
    .line 910
    if-eq v3, v7, :cond_17

    .line 911
    .line 912
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 913
    .line 914
    .line 915
    goto :goto_a

    .line 916
    :cond_17
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 917
    .line 918
    .line 919
    move-result v2

    .line 920
    move v10, v2

    .line 921
    goto :goto_a

    .line 922
    :cond_18
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 923
    .line 924
    .line 925
    move-result-wide v2

    .line 926
    move-wide v4, v2

    .line 927
    goto :goto_a

    .line 928
    :cond_19
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v2

    .line 932
    move-object v11, v2

    .line 933
    goto :goto_a

    .line 934
    :cond_1a
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 935
    .line 936
    .line 937
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzoh;

    .line 938
    .line 939
    invoke-direct {v0, v11, v4, v5, v10}, Lcom/google/android/gms/measurement/internal/zzoh;-><init>(Ljava/lang/String;JI)V

    .line 940
    .line 941
    .line 942
    return-object v0

    .line 943
    :pswitch_40
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 944
    .line 945
    .line 946
    move-result v0

    .line 947
    new-instance v2, Landroid/os/Bundle;

    .line 948
    .line 949
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 950
    .line 951
    .line 952
    sget-object v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->o:[Lcom/google/android/gms/common/api/Scope;

    .line 953
    .line 954
    sget-object v4, Lcom/google/android/gms/common/internal/GetServiceRequest;->p:[Lcom/google/android/gms/common/Feature;

    .line 955
    .line 956
    move-object/from16 v19, v2

    .line 957
    .line 958
    move-object/from16 v18, v3

    .line 959
    .line 960
    move-object/from16 v21, v4

    .line 961
    .line 962
    move-object/from16 v22, v21

    .line 963
    .line 964
    move v13, v10

    .line 965
    move v14, v13

    .line 966
    move v15, v14

    .line 967
    move/from16 v23, v15

    .line 968
    .line 969
    move/from16 v24, v23

    .line 970
    .line 971
    move/from16 v25, v24

    .line 972
    .line 973
    move-object/from16 v16, v11

    .line 974
    .line 975
    move-object/from16 v17, v16

    .line 976
    .line 977
    move-object/from16 v20, v17

    .line 978
    .line 979
    move-object/from16 v26, v20

    .line 980
    .line 981
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 982
    .line 983
    .line 984
    move-result v2

    .line 985
    if-ge v2, v0, :cond_1b

    .line 986
    .line 987
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 988
    .line 989
    .line 990
    move-result v2

    .line 991
    int-to-char v3, v2

    .line 992
    packed-switch v3, :pswitch_data_5

    .line 993
    .line 994
    .line 995
    :pswitch_41
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 996
    .line 997
    .line 998
    goto :goto_b

    .line 999
    :pswitch_42
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v26

    .line 1003
    goto :goto_b

    .line 1004
    :pswitch_43
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v25

    .line 1008
    goto :goto_b

    .line 1009
    :pswitch_44
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1010
    .line 1011
    .line 1012
    move-result v24

    .line 1013
    goto :goto_b

    .line 1014
    :pswitch_45
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v23

    .line 1018
    goto :goto_b

    .line 1019
    :pswitch_46
    sget-object v3, Lcom/google/android/gms/common/Feature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1020
    .line 1021
    invoke-static {v1, v2, v3}, La/b5x;->F(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    move-object/from16 v22, v2

    .line 1026
    .line 1027
    check-cast v22, [Lcom/google/android/gms/common/Feature;

    .line 1028
    .line 1029
    goto :goto_b

    .line 1030
    :pswitch_47
    sget-object v3, Lcom/google/android/gms/common/Feature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1031
    .line 1032
    invoke-static {v1, v2, v3}, La/b5x;->F(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v2

    .line 1036
    move-object/from16 v21, v2

    .line 1037
    .line 1038
    check-cast v21, [Lcom/google/android/gms/common/Feature;

    .line 1039
    .line 1040
    goto :goto_b

    .line 1041
    :pswitch_48
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1042
    .line 1043
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    move-object/from16 v20, v2

    .line 1048
    .line 1049
    check-cast v20, Landroid/accounts/Account;

    .line 1050
    .line 1051
    goto :goto_b

    .line 1052
    :pswitch_49
    invoke-static {v1, v2}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v19

    .line 1056
    goto :goto_b

    .line 1057
    :pswitch_4a
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1058
    .line 1059
    invoke-static {v1, v2, v3}, La/b5x;->F(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    move-object/from16 v18, v2

    .line 1064
    .line 1065
    check-cast v18, [Lcom/google/android/gms/common/api/Scope;

    .line 1066
    .line 1067
    goto :goto_b

    .line 1068
    :pswitch_4b
    invoke-static {v1, v2}, La/b5x;->V(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v17

    .line 1072
    goto :goto_b

    .line 1073
    :pswitch_4c
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v16

    .line 1077
    goto :goto_b

    .line 1078
    :pswitch_4d
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1079
    .line 1080
    .line 1081
    move-result v15

    .line 1082
    goto :goto_b

    .line 1083
    :pswitch_4e
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1084
    .line 1085
    .line 1086
    move-result v14

    .line 1087
    goto :goto_b

    .line 1088
    :pswitch_4f
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1089
    .line 1090
    .line 1091
    move-result v13

    .line 1092
    goto :goto_b

    .line 1093
    :cond_1b
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1094
    .line 1095
    .line 1096
    new-instance v12, Lcom/google/android/gms/common/internal/GetServiceRequest;

    .line 1097
    .line 1098
    invoke-direct/range {v12 .. v26}, Lcom/google/android/gms/common/internal/GetServiceRequest;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/Feature;[Lcom/google/android/gms/common/Feature;ZIZLjava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    return-object v12

    .line 1102
    :pswitch_50
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1103
    .line 1104
    .line 1105
    move-result v0

    .line 1106
    move v2, v10

    .line 1107
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1108
    .line 1109
    .line 1110
    move-result v3

    .line 1111
    if-ge v3, v0, :cond_1f

    .line 1112
    .line 1113
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1114
    .line 1115
    .line 1116
    move-result v3

    .line 1117
    int-to-char v4, v3

    .line 1118
    if-eq v4, v9, :cond_1e

    .line 1119
    .line 1120
    if-eq v4, v7, :cond_1d

    .line 1121
    .line 1122
    if-eq v4, v6, :cond_1c

    .line 1123
    .line 1124
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1125
    .line 1126
    .line 1127
    goto :goto_c

    .line 1128
    :cond_1c
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1129
    .line 1130
    .line 1131
    move-result v2

    .line 1132
    goto :goto_c

    .line 1133
    :cond_1d
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v11

    .line 1137
    goto :goto_c

    .line 1138
    :cond_1e
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1139
    .line 1140
    .line 1141
    move-result v10

    .line 1142
    goto :goto_c

    .line 1143
    :cond_1f
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1144
    .line 1145
    .line 1146
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    .line 1147
    .line 1148
    invoke-direct {v0, v10, v2, v11}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;-><init>(IILjava/lang/String;)V

    .line 1149
    .line 1150
    .line 1151
    return-object v0

    .line 1152
    :pswitch_51
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1153
    .line 1154
    .line 1155
    move-result v0

    .line 1156
    move v3, v10

    .line 1157
    move v4, v3

    .line 1158
    move v6, v4

    .line 1159
    move-object v2, v11

    .line 1160
    move-object v5, v2

    .line 1161
    move-object v7, v5

    .line 1162
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1163
    .line 1164
    .line 1165
    move-result v8

    .line 1166
    if-ge v8, v0, :cond_20

    .line 1167
    .line 1168
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1169
    .line 1170
    .line 1171
    move-result v8

    .line 1172
    int-to-char v9, v8

    .line 1173
    packed-switch v9, :pswitch_data_6

    .line 1174
    .line 1175
    .line 1176
    invoke-static {v1, v8}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_d

    .line 1180
    :pswitch_52
    invoke-static {v1, v8}, La/b5x;->B(Landroid/os/Parcel;I)[I

    .line 1181
    .line 1182
    .line 1183
    move-result-object v7

    .line 1184
    goto :goto_d

    .line 1185
    :pswitch_53
    invoke-static {v1, v8}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1186
    .line 1187
    .line 1188
    move-result v6

    .line 1189
    goto :goto_d

    .line 1190
    :pswitch_54
    invoke-static {v1, v8}, La/b5x;->B(Landroid/os/Parcel;I)[I

    .line 1191
    .line 1192
    .line 1193
    move-result-object v5

    .line 1194
    goto :goto_d

    .line 1195
    :pswitch_55
    invoke-static {v1, v8}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1196
    .line 1197
    .line 1198
    move-result v4

    .line 1199
    goto :goto_d

    .line 1200
    :pswitch_56
    invoke-static {v1, v8}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v3

    .line 1204
    goto :goto_d

    .line 1205
    :pswitch_57
    sget-object v2, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1206
    .line 1207
    invoke-static {v1, v8, v2}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v2

    .line 1211
    check-cast v2, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 1212
    .line 1213
    goto :goto_d

    .line 1214
    :cond_20
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1215
    .line 1216
    .line 1217
    new-instance v1, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 1218
    .line 1219
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;-><init>(Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;ZZ[II[I)V

    .line 1220
    .line 1221
    .line 1222
    return-object v1

    .line 1223
    :pswitch_58
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1224
    .line 1225
    .line 1226
    move-result v0

    .line 1227
    move-object v2, v11

    .line 1228
    move-object v4, v2

    .line 1229
    move-object v5, v4

    .line 1230
    move-object v8, v5

    .line 1231
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1232
    .line 1233
    .line 1234
    move-result v10

    .line 1235
    if-ge v10, v0, :cond_26

    .line 1236
    .line 1237
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1238
    .line 1239
    .line 1240
    move-result v10

    .line 1241
    int-to-char v12, v10

    .line 1242
    if-eq v12, v9, :cond_25

    .line 1243
    .line 1244
    if-eq v12, v7, :cond_24

    .line 1245
    .line 1246
    if-eq v12, v6, :cond_23

    .line 1247
    .line 1248
    if-eq v12, v3, :cond_21

    .line 1249
    .line 1250
    invoke-static {v1, v10}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1251
    .line 1252
    .line 1253
    goto :goto_e

    .line 1254
    :cond_21
    invoke-static {v1, v10}, La/b5x;->Z(Landroid/os/Parcel;I)I

    .line 1255
    .line 1256
    .line 1257
    move-result v8

    .line 1258
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1259
    .line 1260
    .line 1261
    move-result v10

    .line 1262
    if-nez v8, :cond_22

    .line 1263
    .line 1264
    move-object v8, v11

    .line 1265
    goto :goto_e

    .line 1266
    :cond_22
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v12

    .line 1270
    add-int/2addr v10, v8

    .line 1271
    invoke-virtual {v1, v10}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1272
    .line 1273
    .line 1274
    move-object v8, v12

    .line 1275
    goto :goto_e

    .line 1276
    :cond_23
    invoke-static {v1, v10}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1277
    .line 1278
    .line 1279
    move-result-object v5

    .line 1280
    goto :goto_e

    .line 1281
    :cond_24
    invoke-static {v1, v10}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1282
    .line 1283
    .line 1284
    move-result-object v4

    .line 1285
    goto :goto_e

    .line 1286
    :cond_25
    invoke-static {v1, v10}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1287
    .line 1288
    .line 1289
    move-result-object v2

    .line 1290
    goto :goto_e

    .line 1291
    :cond_26
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1292
    .line 1293
    .line 1294
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    .line 1295
    .line 1296
    invoke-direct {v0, v2, v4, v5, v8}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;-><init>([B[B[B[Ljava/lang/String;)V

    .line 1297
    .line 1298
    .line 1299
    return-object v0

    .line 1300
    :pswitch_59
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1301
    .line 1302
    .line 1303
    move-result v0

    .line 1304
    move-object v2, v11

    .line 1305
    move-object v3, v2

    .line 1306
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1307
    .line 1308
    .line 1309
    move-result v4

    .line 1310
    if-ge v4, v0, :cond_2b

    .line 1311
    .line 1312
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1313
    .line 1314
    .line 1315
    move-result v4

    .line 1316
    int-to-char v5, v4

    .line 1317
    if-eq v5, v8, :cond_2a

    .line 1318
    .line 1319
    if-eq v5, v9, :cond_29

    .line 1320
    .line 1321
    if-eq v5, v7, :cond_28

    .line 1322
    .line 1323
    if-eq v5, v6, :cond_27

    .line 1324
    .line 1325
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1326
    .line 1327
    .line 1328
    goto :goto_f

    .line 1329
    :cond_27
    sget-object v3, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1330
    .line 1331
    invoke-static {v1, v4, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v3

    .line 1335
    check-cast v3, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 1336
    .line 1337
    goto :goto_f

    .line 1338
    :cond_28
    invoke-static {v1, v4}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1339
    .line 1340
    .line 1341
    move-result v10

    .line 1342
    goto :goto_f

    .line 1343
    :cond_29
    sget-object v2, Lcom/google/android/gms/common/Feature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1344
    .line 1345
    invoke-static {v1, v4, v2}, La/b5x;->F(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v2

    .line 1349
    check-cast v2, [Lcom/google/android/gms/common/Feature;

    .line 1350
    .line 1351
    goto :goto_f

    .line 1352
    :cond_2a
    invoke-static {v1, v4}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v11

    .line 1356
    goto :goto_f

    .line 1357
    :cond_2b
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1358
    .line 1359
    .line 1360
    new-instance v0, Lcom/google/android/gms/common/internal/zzj;

    .line 1361
    .line 1362
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1363
    .line 1364
    .line 1365
    iput-object v11, v0, Lcom/google/android/gms/common/internal/zzj;->a:Landroid/os/Bundle;

    .line 1366
    .line 1367
    iput-object v2, v0, Lcom/google/android/gms/common/internal/zzj;->b:[Lcom/google/android/gms/common/Feature;

    .line 1368
    .line 1369
    iput v10, v0, Lcom/google/android/gms/common/internal/zzj;->c:I

    .line 1370
    .line 1371
    iput-object v3, v0, Lcom/google/android/gms/common/internal/zzj;->d:Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 1372
    .line 1373
    return-object v0

    .line 1374
    :pswitch_5a
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1375
    .line 1376
    .line 1377
    move-result v0

    .line 1378
    move v2, v10

    .line 1379
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1380
    .line 1381
    .line 1382
    move-result v3

    .line 1383
    if-ge v3, v0, :cond_2e

    .line 1384
    .line 1385
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1386
    .line 1387
    .line 1388
    move-result v3

    .line 1389
    int-to-char v4, v3

    .line 1390
    if-eq v4, v8, :cond_2d

    .line 1391
    .line 1392
    if-eq v4, v9, :cond_2c

    .line 1393
    .line 1394
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1395
    .line 1396
    .line 1397
    goto :goto_10

    .line 1398
    :cond_2c
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1399
    .line 1400
    .line 1401
    move-result v2

    .line 1402
    goto :goto_10

    .line 1403
    :cond_2d
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1404
    .line 1405
    .line 1406
    move-result v10

    .line 1407
    goto :goto_10

    .line 1408
    :cond_2e
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1409
    .line 1410
    .line 1411
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzju;

    .line 1412
    .line 1413
    invoke-direct {v0, v10, v2}, Lcom/google/android/gms/internal/measurement/zzju;-><init>(II)V

    .line 1414
    .line 1415
    .line 1416
    return-object v0

    .line 1417
    :pswitch_5b
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1418
    .line 1419
    .line 1420
    move-result v0

    .line 1421
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1422
    .line 1423
    .line 1424
    move-result v2

    .line 1425
    if-ge v2, v0, :cond_30

    .line 1426
    .line 1427
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1428
    .line 1429
    .line 1430
    move-result v2

    .line 1431
    int-to-char v3, v2

    .line 1432
    if-eq v3, v9, :cond_2f

    .line 1433
    .line 1434
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1435
    .line 1436
    .line 1437
    goto :goto_11

    .line 1438
    :cond_2f
    sget-object v3, Lcom/google/android/gms/internal/measurement/zzjq;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1439
    .line 1440
    invoke-static {v1, v2, v3}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v11

    .line 1444
    goto :goto_11

    .line 1445
    :cond_30
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1446
    .line 1447
    .line 1448
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjs;

    .line 1449
    .line 1450
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/measurement/zzjs;-><init>(Ljava/util/ArrayList;)V

    .line 1451
    .line 1452
    .line 1453
    return-object v0

    .line 1454
    :pswitch_5c
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1455
    .line 1456
    .line 1457
    move-result v0

    .line 1458
    move-object v2, v11

    .line 1459
    move-object v4, v2

    .line 1460
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1461
    .line 1462
    .line 1463
    move-result v5

    .line 1464
    if-ge v5, v0, :cond_35

    .line 1465
    .line 1466
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1467
    .line 1468
    .line 1469
    move-result v5

    .line 1470
    int-to-char v8, v5

    .line 1471
    if-eq v8, v9, :cond_34

    .line 1472
    .line 1473
    if-eq v8, v7, :cond_33

    .line 1474
    .line 1475
    if-eq v8, v6, :cond_32

    .line 1476
    .line 1477
    if-eq v8, v3, :cond_31

    .line 1478
    .line 1479
    invoke-static {v1, v5}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1480
    .line 1481
    .line 1482
    goto :goto_12

    .line 1483
    :cond_31
    invoke-static {v1, v5}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1484
    .line 1485
    .line 1486
    move-result v10

    .line 1487
    goto :goto_12

    .line 1488
    :cond_32
    sget-object v4, Lcom/google/android/gms/internal/measurement/zzjo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1489
    .line 1490
    invoke-static {v1, v5, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v4

    .line 1494
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzjo;

    .line 1495
    .line 1496
    goto :goto_12

    .line 1497
    :cond_33
    invoke-static {v1, v5}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v2

    .line 1501
    goto :goto_12

    .line 1502
    :cond_34
    invoke-static {v1, v5}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v11

    .line 1506
    goto :goto_12

    .line 1507
    :cond_35
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1508
    .line 1509
    .line 1510
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjq;

    .line 1511
    .line 1512
    invoke-direct {v0, v11, v2, v4, v10}, Lcom/google/android/gms/internal/measurement/zzjq;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzjo;Z)V

    .line 1513
    .line 1514
    .line 1515
    return-object v0

    .line 1516
    :pswitch_5d
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1517
    .line 1518
    .line 1519
    move-result v0

    .line 1520
    const-wide/16 v6, 0x0

    .line 1521
    .line 1522
    move-wide v14, v4

    .line 1523
    move-wide/from16 v17, v6

    .line 1524
    .line 1525
    move/from16 v16, v10

    .line 1526
    .line 1527
    move/from16 v21, v16

    .line 1528
    .line 1529
    move/from16 v22, v21

    .line 1530
    .line 1531
    move/from16 v23, v22

    .line 1532
    .line 1533
    move-object v13, v11

    .line 1534
    move-object/from16 v19, v13

    .line 1535
    .line 1536
    move-object/from16 v20, v19

    .line 1537
    .line 1538
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1539
    .line 1540
    .line 1541
    move-result v3

    .line 1542
    if-ge v3, v0, :cond_36

    .line 1543
    .line 1544
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1545
    .line 1546
    .line 1547
    move-result v3

    .line 1548
    int-to-char v4, v3

    .line 1549
    packed-switch v4, :pswitch_data_7

    .line 1550
    .line 1551
    .line 1552
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1553
    .line 1554
    .line 1555
    goto :goto_13

    .line 1556
    :pswitch_5e
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1557
    .line 1558
    .line 1559
    move-result v3

    .line 1560
    move/from16 v23, v3

    .line 1561
    .line 1562
    goto :goto_13

    .line 1563
    :pswitch_5f
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1564
    .line 1565
    .line 1566
    move-result v3

    .line 1567
    move/from16 v22, v3

    .line 1568
    .line 1569
    goto :goto_13

    .line 1570
    :pswitch_60
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1571
    .line 1572
    .line 1573
    move-result v3

    .line 1574
    move/from16 v21, v3

    .line 1575
    .line 1576
    goto :goto_13

    .line 1577
    :pswitch_61
    invoke-static {v1, v3}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1578
    .line 1579
    .line 1580
    move-result-object v3

    .line 1581
    move-object/from16 v20, v3

    .line 1582
    .line 1583
    goto :goto_13

    .line 1584
    :pswitch_62
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v3

    .line 1588
    move-object/from16 v19, v3

    .line 1589
    .line 1590
    goto :goto_13

    .line 1591
    :pswitch_63
    invoke-static {v1, v3, v2}, La/b5x;->j0(Landroid/os/Parcel;II)V

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 1595
    .line 1596
    .line 1597
    move-result-wide v3

    .line 1598
    move-wide/from16 v17, v3

    .line 1599
    .line 1600
    goto :goto_13

    .line 1601
    :pswitch_64
    invoke-static {v1, v3}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1602
    .line 1603
    .line 1604
    move-result v3

    .line 1605
    move/from16 v16, v3

    .line 1606
    .line 1607
    goto :goto_13

    .line 1608
    :pswitch_65
    invoke-static {v1, v3}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 1609
    .line 1610
    .line 1611
    move-result-wide v3

    .line 1612
    move-wide v14, v3

    .line 1613
    goto :goto_13

    .line 1614
    :pswitch_66
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v3

    .line 1618
    move-object v13, v3

    .line 1619
    goto :goto_13

    .line 1620
    :cond_36
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1621
    .line 1622
    .line 1623
    new-instance v12, Lcom/google/android/gms/internal/measurement/zzjo;

    .line 1624
    .line 1625
    invoke-direct/range {v12 .. v23}, Lcom/google/android/gms/internal/measurement/zzjo;-><init>(Ljava/lang/String;JZDLjava/lang/String;[BIII)V

    .line 1626
    .line 1627
    .line 1628
    return-object v12

    .line 1629
    :pswitch_67
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1630
    .line 1631
    .line 1632
    move-result v0

    .line 1633
    move-object v13, v11

    .line 1634
    move-object v14, v13

    .line 1635
    move-object v15, v14

    .line 1636
    move-object/from16 v16, v15

    .line 1637
    .line 1638
    move-object/from16 v17, v16

    .line 1639
    .line 1640
    move-object/from16 v18, v17

    .line 1641
    .line 1642
    move-object/from16 v19, v18

    .line 1643
    .line 1644
    move-object/from16 v20, v19

    .line 1645
    .line 1646
    move-object/from16 v21, v20

    .line 1647
    .line 1648
    move-object/from16 v22, v21

    .line 1649
    .line 1650
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1651
    .line 1652
    .line 1653
    move-result v2

    .line 1654
    if-ge v2, v0, :cond_37

    .line 1655
    .line 1656
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1657
    .line 1658
    .line 1659
    move-result v2

    .line 1660
    int-to-char v3, v2

    .line 1661
    packed-switch v3, :pswitch_data_8

    .line 1662
    .line 1663
    .line 1664
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1665
    .line 1666
    .line 1667
    goto :goto_14

    .line 1668
    :pswitch_68
    invoke-static {v1, v2}, La/b5x;->A(Landroid/os/Parcel;I)[[B

    .line 1669
    .line 1670
    .line 1671
    move-result-object v22

    .line 1672
    goto :goto_14

    .line 1673
    :pswitch_69
    invoke-static {v1, v2}, La/b5x;->B(Landroid/os/Parcel;I)[I

    .line 1674
    .line 1675
    .line 1676
    move-result-object v21

    .line 1677
    goto :goto_14

    .line 1678
    :pswitch_6a
    invoke-static {v1, v2}, La/b5x;->A(Landroid/os/Parcel;I)[[B

    .line 1679
    .line 1680
    .line 1681
    move-result-object v20

    .line 1682
    goto :goto_14

    .line 1683
    :pswitch_6b
    invoke-static {v1, v2}, La/b5x;->B(Landroid/os/Parcel;I)[I

    .line 1684
    .line 1685
    .line 1686
    move-result-object v19

    .line 1687
    goto :goto_14

    .line 1688
    :pswitch_6c
    invoke-static {v1, v2}, La/b5x;->A(Landroid/os/Parcel;I)[[B

    .line 1689
    .line 1690
    .line 1691
    move-result-object v18

    .line 1692
    goto :goto_14

    .line 1693
    :pswitch_6d
    invoke-static {v1, v2}, La/b5x;->A(Landroid/os/Parcel;I)[[B

    .line 1694
    .line 1695
    .line 1696
    move-result-object v17

    .line 1697
    goto :goto_14

    .line 1698
    :pswitch_6e
    invoke-static {v1, v2}, La/b5x;->A(Landroid/os/Parcel;I)[[B

    .line 1699
    .line 1700
    .line 1701
    move-result-object v16

    .line 1702
    goto :goto_14

    .line 1703
    :pswitch_6f
    invoke-static {v1, v2}, La/b5x;->A(Landroid/os/Parcel;I)[[B

    .line 1704
    .line 1705
    .line 1706
    move-result-object v15

    .line 1707
    goto :goto_14

    .line 1708
    :pswitch_70
    invoke-static {v1, v2}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1709
    .line 1710
    .line 1711
    move-result-object v14

    .line 1712
    goto :goto_14

    .line 1713
    :pswitch_71
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v13

    .line 1717
    goto :goto_14

    .line 1718
    :cond_37
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1719
    .line 1720
    .line 1721
    new-instance v12, Lcom/google/android/gms/internal/measurement/zzjl;

    .line 1722
    .line 1723
    invoke-direct/range {v12 .. v22}, Lcom/google/android/gms/internal/measurement/zzjl;-><init>(Ljava/lang/String;[B[[B[[B[[B[[B[I[[B[I[[B)V

    .line 1724
    .line 1725
    .line 1726
    return-object v12

    .line 1727
    :pswitch_72
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1728
    .line 1729
    .line 1730
    move-result v0

    .line 1731
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1732
    .line 1733
    .line 1734
    move-result v2

    .line 1735
    if-ge v2, v0, :cond_39

    .line 1736
    .line 1737
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1738
    .line 1739
    .line 1740
    move-result v2

    .line 1741
    int-to-char v3, v2

    .line 1742
    if-eq v3, v9, :cond_38

    .line 1743
    .line 1744
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1745
    .line 1746
    .line 1747
    goto :goto_15

    .line 1748
    :cond_38
    invoke-static {v1, v2}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1749
    .line 1750
    .line 1751
    move-result-object v11

    .line 1752
    goto :goto_15

    .line 1753
    :cond_39
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1754
    .line 1755
    .line 1756
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjj;

    .line 1757
    .line 1758
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/measurement/zzjj;-><init>([B)V

    .line 1759
    .line 1760
    .line 1761
    return-object v0

    .line 1762
    :pswitch_73
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1763
    .line 1764
    .line 1765
    move-result v0

    .line 1766
    move-wide/from16 v18, v4

    .line 1767
    .line 1768
    move/from16 v16, v10

    .line 1769
    .line 1770
    move-object v13, v11

    .line 1771
    move-object v14, v13

    .line 1772
    move-object v15, v14

    .line 1773
    move-object/from16 v17, v15

    .line 1774
    .line 1775
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1776
    .line 1777
    .line 1778
    move-result v2

    .line 1779
    if-ge v2, v0, :cond_3a

    .line 1780
    .line 1781
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1782
    .line 1783
    .line 1784
    move-result v2

    .line 1785
    int-to-char v3, v2

    .line 1786
    packed-switch v3, :pswitch_data_9

    .line 1787
    .line 1788
    .line 1789
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1790
    .line 1791
    .line 1792
    goto :goto_16

    .line 1793
    :pswitch_74
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 1794
    .line 1795
    .line 1796
    move-result-wide v2

    .line 1797
    move-wide/from16 v18, v2

    .line 1798
    .line 1799
    goto :goto_16

    .line 1800
    :pswitch_75
    invoke-static {v1, v2}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1801
    .line 1802
    .line 1803
    move-result-object v2

    .line 1804
    move-object/from16 v17, v2

    .line 1805
    .line 1806
    goto :goto_16

    .line 1807
    :pswitch_76
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v2

    .line 1811
    move/from16 v16, v2

    .line 1812
    .line 1813
    goto :goto_16

    .line 1814
    :pswitch_77
    sget-object v3, Lcom/google/android/gms/internal/measurement/zzjf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1815
    .line 1816
    invoke-static {v1, v2, v3}, La/b5x;->F(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v2

    .line 1820
    check-cast v2, [Lcom/google/android/gms/internal/measurement/zzjf;

    .line 1821
    .line 1822
    move-object v15, v2

    .line 1823
    goto :goto_16

    .line 1824
    :pswitch_78
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v2

    .line 1828
    move-object v14, v2

    .line 1829
    goto :goto_16

    .line 1830
    :pswitch_79
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v2

    .line 1834
    move-object v13, v2

    .line 1835
    goto :goto_16

    .line 1836
    :cond_3a
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1837
    .line 1838
    .line 1839
    new-instance v12, Lcom/google/android/gms/internal/measurement/zzjh;

    .line 1840
    .line 1841
    invoke-direct/range {v12 .. v19}, Lcom/google/android/gms/internal/measurement/zzjh;-><init>(Ljava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/internal/measurement/zzjf;Z[BJ)V

    .line 1842
    .line 1843
    .line 1844
    return-object v12

    .line 1845
    :pswitch_7a
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1846
    .line 1847
    .line 1848
    move-result v0

    .line 1849
    move-object v2, v11

    .line 1850
    move-object v3, v2

    .line 1851
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1852
    .line 1853
    .line 1854
    move-result v4

    .line 1855
    if-ge v4, v0, :cond_3f

    .line 1856
    .line 1857
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1858
    .line 1859
    .line 1860
    move-result v4

    .line 1861
    int-to-char v5, v4

    .line 1862
    if-eq v5, v9, :cond_3e

    .line 1863
    .line 1864
    if-eq v5, v7, :cond_3d

    .line 1865
    .line 1866
    if-eq v5, v6, :cond_3b

    .line 1867
    .line 1868
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1869
    .line 1870
    .line 1871
    goto :goto_17

    .line 1872
    :cond_3b
    invoke-static {v1, v4}, La/b5x;->Z(Landroid/os/Parcel;I)I

    .line 1873
    .line 1874
    .line 1875
    move-result v3

    .line 1876
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1877
    .line 1878
    .line 1879
    move-result v4

    .line 1880
    if-nez v3, :cond_3c

    .line 1881
    .line 1882
    move-object v3, v11

    .line 1883
    goto :goto_17

    .line 1884
    :cond_3c
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v5

    .line 1888
    add-int/2addr v4, v3

    .line 1889
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1890
    .line 1891
    .line 1892
    move-object v3, v5

    .line 1893
    goto :goto_17

    .line 1894
    :cond_3d
    sget-object v2, Lcom/google/android/gms/internal/measurement/zzjo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1895
    .line 1896
    invoke-static {v1, v4, v2}, La/b5x;->F(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v2

    .line 1900
    check-cast v2, [Lcom/google/android/gms/internal/measurement/zzjo;

    .line 1901
    .line 1902
    goto :goto_17

    .line 1903
    :cond_3e
    invoke-static {v1, v4}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1904
    .line 1905
    .line 1906
    move-result v10

    .line 1907
    goto :goto_17

    .line 1908
    :cond_3f
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1909
    .line 1910
    .line 1911
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjf;

    .line 1912
    .line 1913
    invoke-direct {v0, v10, v2, v3}, Lcom/google/android/gms/internal/measurement/zzjf;-><init>(I[Lcom/google/android/gms/internal/measurement/zzjo;[Ljava/lang/String;)V

    .line 1914
    .line 1915
    .line 1916
    return-object v0

    .line 1917
    :pswitch_7b
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1918
    .line 1919
    .line 1920
    move-result v0

    .line 1921
    move-object v13, v11

    .line 1922
    move-object v14, v13

    .line 1923
    move-object v15, v14

    .line 1924
    move-object/from16 v16, v15

    .line 1925
    .line 1926
    move-object/from16 v17, v16

    .line 1927
    .line 1928
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1929
    .line 1930
    .line 1931
    move-result v2

    .line 1932
    if-ge v2, v0, :cond_45

    .line 1933
    .line 1934
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1935
    .line 1936
    .line 1937
    move-result v2

    .line 1938
    int-to-char v4, v2

    .line 1939
    if-eq v4, v9, :cond_44

    .line 1940
    .line 1941
    if-eq v4, v7, :cond_43

    .line 1942
    .line 1943
    if-eq v4, v6, :cond_42

    .line 1944
    .line 1945
    if-eq v4, v3, :cond_41

    .line 1946
    .line 1947
    const/4 v5, 0x6

    .line 1948
    if-eq v4, v5, :cond_40

    .line 1949
    .line 1950
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1951
    .line 1952
    .line 1953
    goto :goto_18

    .line 1954
    :cond_40
    invoke-static {v1, v2}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1955
    .line 1956
    .line 1957
    move-result-object v17

    .line 1958
    goto :goto_18

    .line 1959
    :cond_41
    invoke-static {v1, v2}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1960
    .line 1961
    .line 1962
    move-result-object v16

    .line 1963
    goto :goto_18

    .line 1964
    :cond_42
    invoke-static {v1, v2}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1965
    .line 1966
    .line 1967
    move-result-object v15

    .line 1968
    goto :goto_18

    .line 1969
    :cond_43
    invoke-static {v1, v2}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1970
    .line 1971
    .line 1972
    move-result-object v14

    .line 1973
    goto :goto_18

    .line 1974
    :cond_44
    invoke-static {v1, v2}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1975
    .line 1976
    .line 1977
    move-result-object v13

    .line 1978
    goto :goto_18

    .line 1979
    :cond_45
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1980
    .line 1981
    .line 1982
    new-instance v12, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;

    .line 1983
    .line 1984
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;-><init>([B[B[B[B[B)V

    .line 1985
    .line 1986
    .line 1987
    return-object v12

    .line 1988
    :pswitch_7c
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1989
    .line 1990
    .line 1991
    move-result v0

    .line 1992
    move-object v2, v11

    .line 1993
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1994
    .line 1995
    .line 1996
    move-result v3

    .line 1997
    if-ge v3, v0, :cond_48

    .line 1998
    .line 1999
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2000
    .line 2001
    .line 2002
    move-result v3

    .line 2003
    int-to-char v4, v3

    .line 2004
    if-eq v4, v8, :cond_47

    .line 2005
    .line 2006
    if-eq v4, v9, :cond_46

    .line 2007
    .line 2008
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 2009
    .line 2010
    .line 2011
    goto :goto_19

    .line 2012
    :cond_46
    invoke-static {v1, v3}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 2013
    .line 2014
    .line 2015
    move-result-object v2

    .line 2016
    goto :goto_19

    .line 2017
    :cond_47
    invoke-static {v1, v3}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 2018
    .line 2019
    .line 2020
    move-result v10

    .line 2021
    goto :goto_19

    .line 2022
    :cond_48
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 2023
    .line 2024
    .line 2025
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/zzh;

    .line 2026
    .line 2027
    if-nez v2, :cond_49

    .line 2028
    .line 2029
    goto :goto_1a

    .line 2030
    :cond_49
    array-length v1, v2

    .line 2031
    invoke-static {v2, v1}, La/vuw0;->k([BI)La/vuw0;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v11

    .line 2035
    :goto_1a
    invoke-direct {v0, v10, v11}, Lcom/google/android/gms/fido/fido2/api/common/zzh;-><init>(ZLa/vuw0;)V

    .line 2036
    .line 2037
    .line 2038
    return-object v0

    .line 2039
    :pswitch_7d
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 2040
    .line 2041
    .line 2042
    move-result v0

    .line 2043
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2044
    .line 2045
    .line 2046
    move-result v2

    .line 2047
    if-ge v2, v0, :cond_4b

    .line 2048
    .line 2049
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2050
    .line 2051
    .line 2052
    move-result v2

    .line 2053
    int-to-char v3, v2

    .line 2054
    if-eq v3, v8, :cond_4a

    .line 2055
    .line 2056
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 2057
    .line 2058
    .line 2059
    goto :goto_1b

    .line 2060
    :cond_4a
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v11

    .line 2064
    goto :goto_1b

    .line 2065
    :cond_4b
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 2066
    .line 2067
    .line 2068
    new-instance v0, Lcom/google/firebase/auth/FacebookAuthCredential;

    .line 2069
    .line 2070
    invoke-direct {v0, v11}, Lcom/google/firebase/auth/FacebookAuthCredential;-><init>(Ljava/lang/String;)V

    .line 2071
    .line 2072
    .line 2073
    return-object v0

    .line 2074
    :pswitch_7e
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 2075
    .line 2076
    .line 2077
    move-result v0

    .line 2078
    move-object v2, v11

    .line 2079
    move-object v3, v2

    .line 2080
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2081
    .line 2082
    .line 2083
    move-result v4

    .line 2084
    if-ge v4, v0, :cond_4e

    .line 2085
    .line 2086
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2087
    .line 2088
    .line 2089
    move-result v4

    .line 2090
    int-to-char v5, v4

    .line 2091
    if-eq v5, v8, :cond_4d

    .line 2092
    .line 2093
    if-eq v5, v9, :cond_4c

    .line 2094
    .line 2095
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 2096
    .line 2097
    .line 2098
    goto :goto_1c

    .line 2099
    :cond_4c
    invoke-static {v1, v4}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 2100
    .line 2101
    .line 2102
    move-result-object v3

    .line 2103
    goto :goto_1c

    .line 2104
    :cond_4d
    invoke-static {v1, v4}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 2105
    .line 2106
    .line 2107
    move-result-object v2

    .line 2108
    goto :goto_1c

    .line 2109
    :cond_4e
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 2110
    .line 2111
    .line 2112
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/zzf;

    .line 2113
    .line 2114
    if-nez v2, :cond_4f

    .line 2115
    .line 2116
    move-object v1, v11

    .line 2117
    goto :goto_1d

    .line 2118
    :cond_4f
    array-length v1, v2

    .line 2119
    invoke-static {v2, v1}, La/vuw0;->k([BI)La/vuw0;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v1

    .line 2123
    :goto_1d
    if-nez v3, :cond_50

    .line 2124
    .line 2125
    goto :goto_1e

    .line 2126
    :cond_50
    array-length v2, v3

    .line 2127
    invoke-static {v3, v2}, La/vuw0;->k([BI)La/vuw0;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v11

    .line 2131
    :goto_1e
    invoke-direct {v0, v1, v11}, Lcom/google/android/gms/fido/fido2/api/common/zzf;-><init>(La/vuw0;La/vuw0;)V

    .line 2132
    .line 2133
    .line 2134
    return-object v0

    .line 2135
    :pswitch_7f
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 2136
    .line 2137
    .line 2138
    move-result v0

    .line 2139
    move/from16 v16, v10

    .line 2140
    .line 2141
    move-object v13, v11

    .line 2142
    move-object v14, v13

    .line 2143
    move-object v15, v14

    .line 2144
    move-object/from16 v17, v15

    .line 2145
    .line 2146
    :goto_1f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2147
    .line 2148
    .line 2149
    move-result v2

    .line 2150
    if-ge v2, v0, :cond_56

    .line 2151
    .line 2152
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2153
    .line 2154
    .line 2155
    move-result v2

    .line 2156
    int-to-char v4, v2

    .line 2157
    if-eq v4, v8, :cond_55

    .line 2158
    .line 2159
    if-eq v4, v9, :cond_54

    .line 2160
    .line 2161
    if-eq v4, v7, :cond_53

    .line 2162
    .line 2163
    if-eq v4, v6, :cond_52

    .line 2164
    .line 2165
    if-eq v4, v3, :cond_51

    .line 2166
    .line 2167
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 2168
    .line 2169
    .line 2170
    goto :goto_1f

    .line 2171
    :cond_51
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 2172
    .line 2173
    .line 2174
    move-result v16

    .line 2175
    goto :goto_1f

    .line 2176
    :cond_52
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v17

    .line 2180
    goto :goto_1f

    .line 2181
    :cond_53
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v15

    .line 2185
    goto :goto_1f

    .line 2186
    :cond_54
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v14

    .line 2190
    goto :goto_1f

    .line 2191
    :cond_55
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v13

    .line 2195
    goto :goto_1f

    .line 2196
    :cond_56
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 2197
    .line 2198
    .line 2199
    new-instance v12, Lcom/google/firebase/auth/EmailAuthCredential;

    .line 2200
    .line 2201
    invoke-direct/range {v12 .. v17}, Lcom/google/firebase/auth/EmailAuthCredential;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 2202
    .line 2203
    .line 2204
    return-object v12

    .line 2205
    :pswitch_80
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 2206
    .line 2207
    .line 2208
    move-result v0

    .line 2209
    :goto_20
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2210
    .line 2211
    .line 2212
    move-result v2

    .line 2213
    if-ge v2, v0, :cond_58

    .line 2214
    .line 2215
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2216
    .line 2217
    .line 2218
    move-result v2

    .line 2219
    int-to-char v3, v2

    .line 2220
    if-eq v3, v8, :cond_57

    .line 2221
    .line 2222
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 2223
    .line 2224
    .line 2225
    goto :goto_20

    .line 2226
    :cond_57
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 2227
    .line 2228
    .line 2229
    move-result v10

    .line 2230
    goto :goto_20

    .line 2231
    :cond_58
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 2232
    .line 2233
    .line 2234
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsCredPropsOutputs;

    .line 2235
    .line 2236
    invoke-direct {v0, v10}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsCredPropsOutputs;-><init>(Z)V

    .line 2237
    .line 2238
    .line 2239
    return-object v0

    .line 2240
    :pswitch_81
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 2241
    .line 2242
    .line 2243
    move-result v0

    .line 2244
    move-object v2, v11

    .line 2245
    move-object v3, v2

    .line 2246
    :goto_21
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2247
    .line 2248
    .line 2249
    move-result v4

    .line 2250
    if-ge v4, v0, :cond_5d

    .line 2251
    .line 2252
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2253
    .line 2254
    .line 2255
    move-result v4

    .line 2256
    int-to-char v5, v4

    .line 2257
    if-eq v5, v8, :cond_5c

    .line 2258
    .line 2259
    if-eq v5, v9, :cond_5b

    .line 2260
    .line 2261
    if-eq v5, v7, :cond_5a

    .line 2262
    .line 2263
    if-eq v5, v6, :cond_59

    .line 2264
    .line 2265
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 2266
    .line 2267
    .line 2268
    goto :goto_21

    .line 2269
    :cond_59
    sget-object v3, Lcom/google/android/gms/common/ConnectionResult;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2270
    .line 2271
    invoke-static {v1, v4, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v3

    .line 2275
    check-cast v3, Lcom/google/android/gms/common/ConnectionResult;

    .line 2276
    .line 2277
    goto :goto_21

    .line 2278
    :cond_5a
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2279
    .line 2280
    invoke-static {v1, v4, v2}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v2

    .line 2284
    check-cast v2, Landroid/app/PendingIntent;

    .line 2285
    .line 2286
    goto :goto_21

    .line 2287
    :cond_5b
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v11

    .line 2291
    goto :goto_21

    .line 2292
    :cond_5c
    invoke-static {v1, v4}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 2293
    .line 2294
    .line 2295
    move-result v10

    .line 2296
    goto :goto_21

    .line 2297
    :cond_5d
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 2298
    .line 2299
    .line 2300
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2301
    .line 2302
    invoke-direct {v0, v10, v11, v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 2303
    .line 2304
    .line 2305
    return-object v0

    .line 2306
    :pswitch_82
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 2307
    .line 2308
    .line 2309
    move-result v0

    .line 2310
    move-object v2, v11

    .line 2311
    move-object v3, v2

    .line 2312
    move-object v4, v3

    .line 2313
    move-object v5, v4

    .line 2314
    move-object v6, v5

    .line 2315
    move-object v7, v6

    .line 2316
    move-object v8, v7

    .line 2317
    :goto_22
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2318
    .line 2319
    .line 2320
    move-result v9

    .line 2321
    if-ge v9, v0, :cond_5e

    .line 2322
    .line 2323
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2324
    .line 2325
    .line 2326
    move-result v9

    .line 2327
    int-to-char v10, v9

    .line 2328
    packed-switch v10, :pswitch_data_a

    .line 2329
    .line 2330
    .line 2331
    invoke-static {v1, v9}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 2332
    .line 2333
    .line 2334
    goto :goto_22

    .line 2335
    :pswitch_83
    invoke-static {v1, v9}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v8

    .line 2339
    goto :goto_22

    .line 2340
    :pswitch_84
    invoke-static {v1, v9}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v7

    .line 2344
    goto :goto_22

    .line 2345
    :pswitch_85
    invoke-static {v1, v9}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2346
    .line 2347
    .line 2348
    move-result-object v6

    .line 2349
    goto :goto_22

    .line 2350
    :pswitch_86
    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2351
    .line 2352
    invoke-static {v1, v9, v5}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v5

    .line 2356
    check-cast v5, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    .line 2357
    .line 2358
    goto :goto_22

    .line 2359
    :pswitch_87
    invoke-static {v1, v9}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2360
    .line 2361
    .line 2362
    move-result-object v4

    .line 2363
    goto :goto_22

    .line 2364
    :pswitch_88
    invoke-static {v1, v9}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v3

    .line 2368
    goto :goto_22

    .line 2369
    :pswitch_89
    invoke-static {v1, v9}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v2

    .line 2373
    goto :goto_22

    .line 2374
    :cond_5e
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 2375
    .line 2376
    .line 2377
    new-instance v1, Lcom/google/firebase/auth/zzc;

    .line 2378
    .line 2379
    invoke-direct/range {v1 .. v8}, Lcom/google/firebase/auth/zzc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzajg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2380
    .line 2381
    .line 2382
    return-object v1

    .line 2383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_73
        :pswitch_72
        :pswitch_67
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_51
        :pswitch_50
        :pswitch_40
        :pswitch_3f
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_2c
        :pswitch_23
        :pswitch_22
        :pswitch_0
    .end packed-switch

    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_1
        :pswitch_13
        :pswitch_1
        :pswitch_1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_24
        :pswitch_25
    .end packed-switch

    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
    .end packed-switch

    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
    .end packed-switch

    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_41
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
    .end packed-switch

    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
    .end packed-switch

    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    :pswitch_data_7
    .packed-switch 0x2
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
    .end packed-switch

    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    :pswitch_data_8
    .packed-switch 0x2
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
    .end packed-switch

    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    :pswitch_data_9
    .packed-switch 0x2
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
    .end packed-switch

    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    :pswitch_data_a
    .packed-switch 0x1
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, La/erw0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/common/zzt;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzr;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/common/zzr;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/common/zzp;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzpl;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzoq;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzoo;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzom;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzoh;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/common/internal/GetServiceRequest;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/common/internal/zzj;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzju;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzjs;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzjq;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzjo;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzjl;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzjj;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzjh;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzjf;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzh;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/firebase/auth/FacebookAuthCredential;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzf;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/firebase/auth/EmailAuthCredential;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsCredPropsOutputs;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/common/api/Status;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/firebase/auth/zzc;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
