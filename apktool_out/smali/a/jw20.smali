.class public final La/jw20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zf60;
.implements La/n1x;
.implements La/lfn0;
.implements La/lry;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 3

    iput-byte p1, p0, La/jw20;->a:B

    packed-switch p1, :pswitch_data_0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    new-instance p1, La/fq80;

    invoke-direct {p1}, La/fq80;-><init>()V

    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    return-void

    .line 114
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 115
    invoke-static {v1, v2, p1, v0}, La/roj0;->b(IILa/i99;I)La/qoj0;

    move-result-object p1

    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/bad;)V
    .locals 2

    const/16 v0, 0xd

    iput-byte v0, p0, La/jw20;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    new-instance v0, La/yqc;

    const/16 v1, 0x12

    invoke-direct {v0, p1, v1}, La/yqc;-><init>(Ljava/lang/Object;B)V

    .line 103
    iput-object v0, p0, La/jw20;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    iput-byte p2, p0, La/jw20;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sparse-switch p2, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance p2, La/tpv;

    .line 13
    .line 14
    const/16 v0, 0x1c

    .line 15
    .line 16
    invoke-direct {p2, p1, v0}, La/tpv;-><init>(La/gii0;B)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/jw20;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance p2, La/rta0;

    .line 26
    .line 27
    const/16 v0, 0x18

    .line 28
    .line 29
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    .line 37
    .line 38
    return-void

    .line 39
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance p2, La/rta0;

    .line 43
    .line 44
    const/16 v0, 0x12

    .line 45
    .line 46
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, La/jw20;->b:Ljava/lang/Object;

    .line 50
    .line 51
    return-void

    .line 52
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance p2, La/rta0;

    .line 56
    .line 57
    const/16 v0, 0xe

    .line 58
    .line 59
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 60
    .line 61
    .line 62
    iput-object p2, p0, La/jw20;->b:Ljava/lang/Object;

    .line 63
    .line 64
    return-void

    .line 65
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance p2, La/rta0;

    .line 69
    .line 70
    const/16 v0, 0xb

    .line 71
    .line 72
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, La/jw20;->b:Ljava/lang/Object;

    .line 76
    .line 77
    return-void

    .line 78
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    new-instance p2, La/rta0;

    .line 82
    .line 83
    const/16 v0, 0x8

    .line 84
    .line 85
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 86
    .line 87
    .line 88
    iput-object p2, p0, La/jw20;->b:Ljava/lang/Object;

    .line 89
    .line 90
    return-void

    .line 91
    :sswitch_data_0
    .sparse-switch
        0xf -> :sswitch_4
        0x10 -> :sswitch_3
        0x14 -> :sswitch_2
        0x15 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/j400;)V
    .locals 1

    const/16 v0, 0xb

    iput-byte v0, p0, La/jw20;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/jld0;)V
    .locals 1

    const/16 v0, 0x11

    iput-byte v0, p0, La/jw20;->a:B

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    invoke-virtual {p1}, La/jld0;->a()La/g45;

    move-result-object p1

    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/oeg0;La/uf3;La/sxs0;La/pru;La/pbt;La/j1q0;La/mne;La/kt2;La/p4u;La/xcc;La/ls;La/z4u;La/gst0;La/ntu;La/fvt0;La/oct;La/wdk0;La/khf0;La/cdu;La/jdu;La/d1p;La/iqt;La/lbu;)V
    .locals 18

    move-object/from16 v0, p0

    const/16 v1, 0x9

    iput-byte v1, v0, La/jw20;->a:B

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p21 .. p21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 107
    new-instance v2, La/nc0;

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p18

    move-object/from16 v16, p20

    move-object/from16 v3, p21

    move-object/from16 v17, p23

    invoke-direct/range {v2 .. v17}, La/nc0;-><init>(La/d1p;La/sxs0;La/oeg0;La/uf3;La/pbt;La/kt2;La/p4u;La/xcc;La/ls;La/z4u;La/gst0;La/ntu;La/khf0;La/jdu;La/lbu;)V

    .line 108
    iput-object v2, v0, La/jw20;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/tr20;La/tr20;Landroid/widget/ImageView;)V
    .locals 0

    const/4 p1, 0x3

    iput-byte p1, p0, La/jw20;->a:B

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p3, p0, La/jw20;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/vff0;)V
    .locals 1

    const/16 v0, 0x1d

    iput-byte v0, p0, La/jw20;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/wdk0;)V
    .locals 1

    const/16 v0, 0x1a

    iput-byte v0, p0, La/jw20;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/wut0;)V
    .locals 1

    const/16 v0, 0x8

    iput-byte v0, p0, La/jw20;->a:B

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    .line 110
    iget-object p0, p1, La/wut0;->a:Landroid/content/Context;

    if-eqz p0, :cond_0

    return-void

    .line 111
    :cond_0
    const-string p0, "context is null"

    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(La/xuz;La/mne;La/rrc;)V
    .locals 0

    const/4 p1, 0x1

    iput-byte p1, p0, La/jw20;->a:B

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance p1, La/kki;

    invoke-direct {p1, p2, p3}, La/kki;-><init>(La/mne;La/rrc;)V

    .line 98
    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 95
    iput-byte p2, p0, La/jw20;->a:B

    iput-object p1, p0, La/jw20;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(La/g950;La/qlc;La/g950;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(La/g950;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/mae0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/g950;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "k"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    instance-of p1, p2, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz p1, :cond_4

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    sget-object p1, La/bry;->b:La/bst;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-object p1, La/bry;->c:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, La/bry;

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    sget-object p1, La/bry;->d:La/bry;

    .line 39
    .line 40
    :cond_0
    iput-object p1, p0, La/mae0;->g:La/bry;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    const-string v0, "mv"

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    instance-of p1, p2, [I

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    check-cast p2, [I

    .line 56
    .line 57
    iput-object p2, p0, La/mae0;->a:[I

    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    const-string v0, "xs"

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    instance-of p1, p2, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    check-cast p2, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    iput-object p2, p0, La/mae0;->b:Ljava/lang/String;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    const-string v0, "xi"

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    instance-of p1, p2, Ljava/lang/Integer;

    .line 92
    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    iput p1, p0, La/mae0;->c:I

    .line 102
    .line 103
    :cond_4
    return-void

    .line 104
    :cond_5
    const-string p0, "pn"

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public d([BIILa/kfn0;La/rbe;)V
    .locals 10

    .line 1
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/fq80;

    .line 4
    .line 5
    add-int/2addr p3, p2

    .line 6
    invoke-virtual {p0, p1, p3}, La/fq80;->K([BI)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p2}, La/fq80;->M(I)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {p0}, La/fq80;->a()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-lez p1, :cond_8

    .line 22
    .line 23
    invoke-virtual {p0}, La/fq80;->a()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 p2, 0x0

    .line 28
    const/4 p3, 0x1

    .line 29
    const/16 p4, 0x8

    .line 30
    .line 31
    if-lt p1, p4, :cond_0

    .line 32
    .line 33
    move p1, p3

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move p1, p2

    .line 36
    :goto_1
    const-string v0, "Incomplete Mp4Webvtt Top Level box header found."

    .line 37
    .line 38
    invoke-static {v0, p1}, La/x0x;->z(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/fq80;->m()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-virtual {p0}, La/fq80;->m()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const v1, 0x76747463

    .line 50
    .line 51
    .line 52
    if-ne v0, v1, :cond_7

    .line 53
    .line 54
    add-int/lit8 p1, p1, -0x8

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    move-object v1, v0

    .line 58
    move-object v2, v1

    .line 59
    :cond_1
    :goto_2
    if-lez p1, :cond_4

    .line 60
    .line 61
    if-lt p1, p4, :cond_2

    .line 62
    .line 63
    move v3, p3

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    move v3, p2

    .line 66
    :goto_3
    const-string v4, "Incomplete vtt cue box header found."

    .line 67
    .line 68
    invoke-static {v4, v3}, La/x0x;->z(Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, La/fq80;->m()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {p0}, La/fq80;->m()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    add-int/lit8 p1, p1, -0x8

    .line 80
    .line 81
    sub-int/2addr v3, p4

    .line 82
    iget-object v6, p0, La/fq80;->a:[B

    .line 83
    .line 84
    iget v7, p0, La/fq80;->b:I

    .line 85
    .line 86
    sget-object v8, La/vtt0;->a:Ljava/lang/String;

    .line 87
    .line 88
    new-instance v8, Ljava/lang/String;

    .line 89
    .line 90
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 91
    .line 92
    invoke-direct {v8, v6, v7, v3, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v3}, La/fq80;->N(I)V

    .line 96
    .line 97
    .line 98
    sub-int/2addr p1, v3

    .line 99
    const v3, 0x73747467

    .line 100
    .line 101
    .line 102
    if-ne v4, v3, :cond_3

    .line 103
    .line 104
    new-instance v2, La/s5v0;

    .line 105
    .line 106
    invoke-direct {v2}, La/s5v0;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-static {v8, v2}, La/t5v0;->e(Ljava/lang/String;La/s5v0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, La/s5v0;->a()La/btf;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    goto :goto_2

    .line 117
    :cond_3
    const v3, 0x7061796c

    .line 118
    .line 119
    .line 120
    if-ne v4, v3, :cond_1

    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 127
    .line 128
    invoke-static {v3, v0, v1}, La/t5v0;->f(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannedString;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    goto :goto_2

    .line 133
    :cond_4
    if-nez v1, :cond_5

    .line 134
    .line 135
    const-string v1, ""

    .line 136
    .line 137
    :cond_5
    if-eqz v2, :cond_6

    .line 138
    .line 139
    iput-object v1, v2, La/btf;->a:Ljava/lang/CharSequence;

    .line 140
    .line 141
    iput-object v0, v2, La/btf;->b:Landroid/graphics/Bitmap;

    .line 142
    .line 143
    invoke-virtual {v2}, La/btf;->a()La/ctf;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto :goto_4

    .line 148
    :cond_6
    sget-object p1, La/t5v0;->a:Ljava/util/regex/Pattern;

    .line 149
    .line 150
    new-instance p1, La/s5v0;

    .line 151
    .line 152
    invoke-direct {p1}, La/s5v0;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object v1, p1, La/s5v0;->c:Ljava/lang/CharSequence;

    .line 156
    .line 157
    invoke-virtual {p1}, La/s5v0;->a()La/btf;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, La/btf;->a()La/ctf;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    :goto_4
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_7
    add-int/lit8 p1, p1, -0x8

    .line 171
    .line 172
    invoke-virtual {p0, p1}, La/fq80;->N(I)V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_8
    new-instance v0, La/ftf;

    .line 178
    .line 179
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    invoke-direct/range {v0 .. v5}, La/ftf;-><init>(JJLjava/util/List;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {p5, v0}, La/rbe;->accept(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public e()La/iw20;
    .locals 1

    .line 1
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/xcz;

    .line 4
    .line 5
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, La/iw20;

    .line 10
    .line 11
    invoke-direct {v0, p0}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public g(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/ibg0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ibg0;

    .line 7
    .line 8
    iget v1, v0, La/ibg0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ibg0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ibg0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ibg0;-><init>(La/jw20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ibg0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ibg0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/n0o0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/kbg0;

    .line 59
    .line 60
    iput v4, v0, La/ibg0;->k:I

    .line 61
    .line 62
    const-string p2, "application/vnd.xenvelop+json"

    .line 63
    .line 64
    invoke-interface {p0, p1, p2, v0}, La/kbg0;->a(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-ne p2, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    check-cast p2, La/dx5;

    .line 72
    .line 73
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/hbg0;

    .line 78
    .line 79
    iget-object p0, p0, La/hbg0;->a:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_4
    invoke-static {v3}, La/jf4;->k(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v3
.end method

.method public h(La/o1x;La/hhn0;)V
    .locals 0

    .line 1
    iget-object p1, p2, La/hhn0;->a:La/dyw;

    .line 2
    .line 3
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p0}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public i(La/qlc;La/g950;)La/lry;
    .locals 0

    .line 1
    const/4 p0, 0x0

    return-object p0
.end method

.method public j(La/g950;)La/mry;
    .locals 1

    .line 1
    invoke-virtual {p1}, La/g950;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "d1"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance p1, La/kae0;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p1, p0, v0}, La/kae0;-><init>(La/jw20;B)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const-string v0, "d2"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p1, La/kae0;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-direct {p1, p0, v0}, La/kae0;-><init>(La/jw20;B)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public k(La/o1x;La/r1o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, 0x1

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/16 p1, 0x8

    .line 18
    .line 19
    iget-object p2, p2, La/xiv0;->a:La/uiv0;

    .line 20
    .line 21
    invoke-virtual {p2, p1}, La/uiv0;->u(I)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/appcompat/widget/d;->clearFocus()V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, La/xiv0;->b:La/xiv0;

    .line 31
    .line 32
    return-object p0
.end method

.method public m(JLjava/lang/String;DDDJLa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/jw20;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/nr;

    .line 6
    .line 7
    iget-object v1, v0, La/nr;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/btt0;

    .line 10
    .line 11
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v0, La/nr;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, La/knf0;

    .line 18
    .line 19
    invoke-virtual {v2}, La/knf0;->a()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v18

    .line 23
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    new-instance v3, La/d0f;

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    move-wide/from16 v14, p1

    .line 35
    .line 36
    move-object/from16 v4, p3

    .line 37
    .line 38
    move-wide/from16 v9, p4

    .line 39
    .line 40
    move-wide/from16 v7, p6

    .line 41
    .line 42
    move-wide/from16 v12, p8

    .line 43
    .line 44
    move-wide/from16 v16, p10

    .line 45
    .line 46
    invoke-direct/range {v3 .. v18}, La/d0f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;DJJLjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-wide/16 v4, 0x0

    .line 50
    .line 51
    cmpl-double v2, p8, v4

    .line 52
    .line 53
    if-lez v2, :cond_0

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    :goto_0
    move-object/from16 v4, p12

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    const/4 v2, 0x0

    .line 60
    goto :goto_0

    .line 61
    :goto_1
    invoke-virtual {v0, v1, v3, v2, v4}, La/nr;->z(Ljava/lang/String;La/d0f;ZLa/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method

.method public n(La/g950;La/tlc;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(I)V
    .locals 1

    .line 1
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->w(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public p(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/u1d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/u1d0;

    .line 7
    .line 8
    iget v1, v0, La/u1d0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/u1d0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/u1d0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/u1d0;-><init>(La/jw20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/u1d0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/u1d0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/rta0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/rta0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/c2d0;

    .line 59
    .line 60
    iput v3, v0, La/u1d0;->k:I

    .line 61
    .line 62
    invoke-interface {p0, v0}, La/c2d0;->b(La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p1, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public q(IJLa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, La/v1d0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/v1d0;

    .line 11
    .line 12
    iget v3, v2, La/v1d0;->n:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/v1d0;->n:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/v1d0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/v1d0;-><init>(La/jw20;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/v1d0;->l:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/v1d0;->n:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const-wide/16 v6, 0x0

    .line 37
    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x1

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v9, :cond_2

    .line 43
    .line 44
    if-ne v4, v8, :cond_1

    .line 45
    .line 46
    iget-short v0, v2, La/v1d0;->j:S

    .line 47
    .line 48
    iget-wide v3, v2, La/v1d0;->i:J

    .line 49
    .line 50
    iget-object v2, v2, La/v1d0;->k:La/b2d0;

    .line 51
    .line 52
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v5

    .line 63
    :cond_2
    iget-short v4, v2, La/v1d0;->j:S

    .line 64
    .line 65
    iget-wide v9, v2, La/v1d0;->i:J

    .line 66
    .line 67
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, La/jw20;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, La/rta0;

    .line 77
    .line 78
    invoke-virtual {v1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, La/c2d0;

    .line 83
    .line 84
    move-wide/from16 v10, p2

    .line 85
    .line 86
    iput-wide v10, v2, La/v1d0;->i:J

    .line 87
    .line 88
    move/from16 v4, p1

    .line 89
    .line 90
    iput-short v4, v2, La/v1d0;->j:S

    .line 91
    .line 92
    iput v9, v2, La/v1d0;->n:I

    .line 93
    .line 94
    invoke-interface {v1, v2}, La/c2d0;->a(La/yje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-ne v1, v3, :cond_4

    .line 99
    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_4
    move-wide v9, v10

    .line 103
    :goto_1
    check-cast v1, La/dx5;

    .line 104
    .line 105
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, La/b2d0;

    .line 110
    .line 111
    iget-object v11, v1, La/b2d0;->a:Ljava/lang/Boolean;

    .line 112
    .line 113
    iget-object v12, v1, La/b2d0;->c:Ljava/util/List;

    .line 114
    .line 115
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-eqz v11, :cond_9

    .line 122
    .line 123
    if-eqz v12, :cond_6

    .line 124
    .line 125
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    if-eqz v11, :cond_5

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-interface {v12, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    if-eqz v11, :cond_9

    .line 141
    .line 142
    :cond_6
    :goto_2
    new-instance v12, La/n1d0;

    .line 143
    .line 144
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 145
    .line 146
    .line 147
    move-result-wide v13

    .line 148
    iget-object v11, v1, La/b2d0;->d:Ljava/lang/Long;

    .line 149
    .line 150
    if-eqz v11, :cond_7

    .line 151
    .line 152
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 153
    .line 154
    .line 155
    move-result-wide v15

    .line 156
    goto :goto_3

    .line 157
    :cond_7
    move-wide v15, v6

    .line 158
    :goto_3
    iget-object v11, v1, La/b2d0;->e:Ljava/lang/Long;

    .line 159
    .line 160
    if-eqz v11, :cond_8

    .line 161
    .line 162
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 163
    .line 164
    .line 165
    move-result-wide v17

    .line 166
    goto :goto_4

    .line 167
    :cond_8
    move-wide/from16 v17, v6

    .line 168
    .line 169
    :goto_4
    invoke-direct/range {v12 .. v18}, La/n1d0;-><init>(JJJ)V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_9
    new-instance v12, La/l1d0;

    .line 174
    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 176
    .line 177
    .line 178
    move-result-wide v13

    .line 179
    invoke-direct {v12, v13, v14}, La/l1d0;-><init>(J)V

    .line 180
    .line 181
    .line 182
    :goto_5
    instance-of v11, v12, La/n1d0;

    .line 183
    .line 184
    if-eqz v11, :cond_a

    .line 185
    .line 186
    move-object v5, v12

    .line 187
    :cond_a
    if-nez v5, :cond_14

    .line 188
    .line 189
    iput-object v1, v2, La/v1d0;->k:La/b2d0;

    .line 190
    .line 191
    iput-wide v9, v2, La/v1d0;->i:J

    .line 192
    .line 193
    iput-short v4, v2, La/v1d0;->j:S

    .line 194
    .line 195
    iput v8, v2, La/v1d0;->n:I

    .line 196
    .line 197
    invoke-virtual {v0, v2}, La/jw20;->p(La/zje;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-ne v0, v3, :cond_b

    .line 202
    .line 203
    :goto_6
    return-object v3

    .line 204
    :cond_b
    move-object v2, v1

    .line 205
    move-object v1, v0

    .line 206
    move v0, v4

    .line 207
    move-wide v3, v9

    .line 208
    :goto_7
    check-cast v1, La/hxv;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    iget-object v5, v1, La/hxv;->a:Ljava/lang/Boolean;

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    iget-object v8, v2, La/b2d0;->b:Ljava/lang/Boolean;

    .line 219
    .line 220
    iget-object v9, v2, La/b2d0;->c:Ljava/util/List;

    .line 221
    .line 222
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    if-eqz v8, :cond_10

    .line 229
    .line 230
    iget-object v8, v2, La/b2d0;->f:Ljava/lang/Long;

    .line 231
    .line 232
    if-eqz v8, :cond_c

    .line 233
    .line 234
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v11

    .line 238
    goto :goto_8

    .line 239
    :cond_c
    move-wide v11, v6

    .line 240
    :goto_8
    iget-object v8, v2, La/b2d0;->g:Ljava/lang/Long;

    .line 241
    .line 242
    if-eqz v8, :cond_d

    .line 243
    .line 244
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 245
    .line 246
    .line 247
    move-result-wide v6

    .line 248
    :cond_d
    cmp-long v6, v3, v6

    .line 249
    .line 250
    if-gtz v6, :cond_10

    .line 251
    .line 252
    cmp-long v3, v11, v3

    .line 253
    .line 254
    if-gtz v3, :cond_10

    .line 255
    .line 256
    if-eqz v9, :cond_f

    .line 257
    .line 258
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_e

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_e
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-interface {v9, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-eqz v3, :cond_10

    .line 274
    .line 275
    :cond_f
    :goto_9
    new-instance v11, La/m1d0;

    .line 276
    .line 277
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 278
    .line 279
    .line 280
    move-result-wide v12

    .line 281
    iget-object v14, v2, La/b2d0;->d:Ljava/lang/Long;

    .line 282
    .line 283
    iget-object v15, v2, La/b2d0;->e:Ljava/lang/Long;

    .line 284
    .line 285
    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v16

    .line 289
    invoke-direct/range {v11 .. v16}, La/m1d0;-><init>(JLjava/lang/Long;Ljava/lang/Long;Z)V

    .line 290
    .line 291
    .line 292
    return-object v11

    .line 293
    :cond_10
    iget-object v1, v1, La/hxv;->b:Ljava/util/List;

    .line 294
    .line 295
    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_13

    .line 300
    .line 301
    if-eqz v1, :cond_12

    .line 302
    .line 303
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_11

    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_13

    .line 319
    .line 320
    :cond_12
    :goto_a
    new-instance v1, La/m1d0;

    .line 321
    .line 322
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 323
    .line 324
    .line 325
    move-result-wide v2

    .line 326
    const/4 v5, 0x0

    .line 327
    const/4 v6, 0x1

    .line 328
    const/4 v4, 0x0

    .line 329
    invoke-direct/range {v1 .. v6}, La/m1d0;-><init>(JLjava/lang/Long;Ljava/lang/Long;Z)V

    .line 330
    .line 331
    .line 332
    return-object v1

    .line 333
    :cond_13
    new-instance v0, La/l1d0;

    .line 334
    .line 335
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 336
    .line 337
    .line 338
    move-result-wide v1

    .line 339
    invoke-direct {v0, v1, v2}, La/l1d0;-><init>(J)V

    .line 340
    .line 341
    .line 342
    return-object v0

    .line 343
    :cond_14
    return-object v5
.end method

.method public r(Landroidx/fragment/app/Fragment;La/ctf0;La/j2g0;)V
    .locals 22

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v2, La/rek0;->b:La/rek0;

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of v3, v1, La/h2g0;

    .line 14
    .line 15
    move-object/from16 v4, p0

    .line 16
    .line 17
    iget-object v4, v4, La/jw20;->b:Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    move-object v8, v4

    .line 23
    check-cast v8, La/wdk0;

    .line 24
    .line 25
    new-instance v7, La/xdk0;

    .line 26
    .line 27
    check-cast v1, La/h2g0;

    .line 28
    .line 29
    iget v1, v1, La/h2g0;->a:I

    .line 30
    .line 31
    new-array v3, v5, [Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 34
    .line 35
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0, v1, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v6, 0x0

    .line 44
    move-object v1, v2

    .line 45
    move-object v2, v0

    .line 46
    move-object v0, v7

    .line 47
    const/16 v7, 0x7c

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 53
    .line 54
    .line 55
    const/4 v12, 0x0

    .line 56
    const/16 v13, 0x3fc

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    move-object v7, v0

    .line 62
    move-object v6, v8

    .line 63
    move-object/from16 v8, p1

    .line 64
    .line 65
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    instance-of v1, v1, La/i2g0;

    .line 70
    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    move-object v14, v4

    .line 74
    check-cast v14, La/wdk0;

    .line 75
    .line 76
    new-instance v15, La/xdk0;

    .line 77
    .line 78
    new-array v1, v5, [Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 81
    .line 82
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const v3, 0x7f1313ec    # 1.9549996E38f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const/4 v6, 0x0

    .line 94
    const/16 v7, 0x7c

    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    const/4 v4, 0x0

    .line 98
    const/4 v5, 0x0

    .line 99
    move-object v1, v2

    .line 100
    move-object v2, v0

    .line 101
    move-object v0, v15

    .line 102
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 103
    .line 104
    .line 105
    const/16 v20, 0x0

    .line 106
    .line 107
    const/16 v21, 0x3fc

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    const/16 v19, 0x0

    .line 114
    .line 115
    move-object/from16 v16, p1

    .line 116
    .line 117
    invoke-static/range {v14 .. v21}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-byte v0, p0, La/jw20;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "OkHttpExecutorConfig(host=\'"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/jw20;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/wut0;

    .line 21
    .line 22
    iget-object v1, p0, La/wut0;->n:Lkotlin/jvm/functions/Function0;

    .line 23
    .line 24
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "\', accessToken=\'"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/wut0;->i:La/a8z;

    .line 39
    .line 40
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v2}, La/w7n0;->m(Ljava/util/List;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, "\', secret=\'"

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, La/xut0;

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    iget-object v1, v1, La/xut0;->b:Ljava/lang/String;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    const/4 v1, 0x0

    .line 79
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, "\', logFilterCredentials="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-boolean p0, p0, La/wut0;->k:Z

    .line 88
    .line 89
    const/16 v1, 0x29

    .line 90
    .line 91
    invoke-static {v0, p0, v1}, La/brm0;->o(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method
