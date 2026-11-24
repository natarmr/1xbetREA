.class public final La/vcj;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/vcj;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/kud",
        "",
        "isApplyEnabled",
        "ui_core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final m2:La/kud;

.field public static final synthetic n2:[La/iiy;

.field public static final o2:Ljava/lang/String;


# instance fields
.field public final k2:La/khf0;

.field public final l2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/vcj;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/vcj;->n2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/kud;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/vcj;->m2:La/kud;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/vcj;->o2:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "KEY_DATE_CALENDAR_PARAMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/vcj;->k2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "KEY_DATE_CALENDAR_REQUEST_KEY"

    .line 16
    .line 17
    const-string v2, "RESULT_KEY_CALENDAR_REQUEST"

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, La/phf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/vcj;->l2:La/phf0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const v1, -0x3e2a3ccd

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, La/vcj;->P0()Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, La/vcj;->P0()Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v2, v2, Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;->c:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, La/vcj;->P0()Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v3, v3, Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 26
    .line 27
    invoke-static {v1, v2, v3, v0}, La/tlb;->b0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;La/fet;)La/hdj;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, La/ukd;->a:La/cl5;

    .line 36
    .line 37
    if-ne v1, v2, :cond_0

    .line 38
    .line 39
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const v3, 0x7f13030c

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-ne v3, v2, :cond_1

    .line 63
    .line 64
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const v4, 0x7f13030b

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    check-cast v3, Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const/4 v10, 0x0

    .line 88
    if-ne v4, v2, :cond_2

    .line 89
    .line 90
    new-instance v4, La/ucj;

    .line 91
    .line 92
    invoke-direct {v4, v8, v10}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {v4}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    check-cast v4, La/l7m0;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    if-nez v5, :cond_3

    .line 113
    .line 114
    if-ne v6, v2, :cond_4

    .line 115
    .line 116
    :cond_3
    new-instance v11, La/wul;

    .line 117
    .line 118
    sget-object v12, La/nul;->e:La/nul;

    .line 119
    .line 120
    sget-object v13, La/oe9;->a:La/oe9;

    .line 121
    .line 122
    new-instance v14, La/ue9;

    .line 123
    .line 124
    invoke-direct {v14, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    .line 131
    const/4 v15, 0x1

    .line 132
    invoke-direct/range {v11 .. v17}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    move-object v6, v11

    .line 139
    :cond_4
    move-object v5, v6

    .line 140
    check-cast v5, La/wul;

    .line 141
    .line 142
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    invoke-virtual {v0, v1}, La/fet;->h(Z)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    or-int/2addr v1, v6

    .line 161
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    if-nez v1, :cond_5

    .line 166
    .line 167
    if-ne v6, v2, :cond_6

    .line 168
    .line 169
    :cond_5
    new-instance v11, La/wul;

    .line 170
    .line 171
    sget-object v12, La/lul;->e:La/lul;

    .line 172
    .line 173
    sget-object v13, La/oe9;->a:La/oe9;

    .line 174
    .line 175
    new-instance v14, La/ue9;

    .line 176
    .line 177
    invoke-direct {v14, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result v15

    .line 190
    const/16 v16, 0x0

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    invoke-direct/range {v11 .. v17}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    move-object v6, v11

    .line 201
    :cond_6
    check-cast v6, La/wul;

    .line 202
    .line 203
    const/4 v1, 0x1

    .line 204
    invoke-static {v1, v0}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    new-instance v11, La/bw5;

    .line 209
    .line 210
    new-instance v1, La/sd8;

    .line 211
    .line 212
    const/16 v2, 0x17

    .line 213
    .line 214
    move-object/from16 v7, p0

    .line 215
    .line 216
    invoke-direct {v1, v7, v2}, La/sd8;-><init>(Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    const v2, 0x1a869622

    .line 220
    .line 221
    .line 222
    invoke-static {v2, v1, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    new-instance v4, La/x2g;

    .line 227
    .line 228
    const/16 v9, 0xe

    .line 229
    .line 230
    invoke-direct/range {v4 .. v9}, La/x2g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 231
    .line 232
    .line 233
    const v1, 0x3ef0efea

    .line 234
    .line 235
    .line 236
    invoke-static {v1, v4, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    new-instance v1, La/sd8;

    .line 241
    .line 242
    const/16 v2, 0x18

    .line 243
    .line 244
    invoke-direct {v1, v8, v2}, La/sd8;-><init>(Ljava/lang/Object;B)V

    .line 245
    .line 246
    .line 247
    const v2, 0x79d7aa24

    .line 248
    .line 249
    .line 250
    invoke-static {v2, v1, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 251
    .line 252
    .line 253
    move-result-object v15

    .line 254
    const/16 v16, 0x2

    .line 255
    .line 256
    invoke-direct/range {v11 .. v16}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 260
    .line 261
    .line 262
    return-object v11
.end method

.method public final P0()Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;
    .locals 2

    .line 1
    sget-object v0, La/vcj;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/vcj;->k2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;

    .line 13
    .line 14
    return-object p0
.end method
