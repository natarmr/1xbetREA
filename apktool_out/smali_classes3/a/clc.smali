.class public final La/clc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zf60;
.implements La/vmb0;
.implements La/giu0;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    iput-byte p1, p0, La/clc;->a:B

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 77
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance p1, La/mlk0;

    .line 79
    sget-object v0, La/m0x0;->i:La/vt5;

    .line 80
    invoke-direct {p1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 81
    iput-object p1, p0, La/clc;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/bl6;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/clc;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, La/clc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/fjj;)V
    .locals 1

    const/16 v0, 0x18

    iput-byte v0, p0, La/clc;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, La/clc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    iput-byte p2, p0, La/clc;->a:B

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
    new-instance p2, La/sza;

    .line 13
    .line 14
    const/16 v0, 0x11

    .line 15
    .line 16
    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/clc;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance p2, La/sza;

    .line 26
    .line 27
    const/16 v0, 0x19

    .line 28
    .line 29
    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, La/clc;->b:Ljava/lang/Object;

    .line 33
    .line 34
    return-void

    .line 35
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance p2, La/sza;

    .line 39
    .line 40
    const/16 v0, 0x16

    .line 41
    .line 42
    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, La/clc;->b:Ljava/lang/Object;

    .line 46
    .line 47
    return-void

    .line 48
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance p2, La/sza;

    .line 52
    .line 53
    const/16 v0, 0x15

    .line 54
    .line 55
    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, La/clc;->b:Ljava/lang/Object;

    .line 59
    .line 60
    return-void

    .line 61
    :sswitch_data_0
    .sparse-switch
        0x12 -> :sswitch_2
        0x13 -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/gok0;)V
    .locals 1

    const/16 v0, 0x8

    iput-byte v0, p0, La/clc;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, La/clc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/iip;La/rmd0;La/q7d0;La/e4u;La/gle0;La/qjg;La/h3c;La/gii0;La/bj5;La/knf0;La/t0d;La/x0t0;La/lbu;La/gst0;La/oeg0;)V
    .locals 14

    const/16 v0, 0x11

    iput-byte v0, p0, La/clc;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v1, La/v7i;

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p13

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    invoke-direct/range {v1 .. v13}, La/v7i;-><init>(La/iip;La/rmd0;La/q7d0;La/qjg;La/h3c;La/gii0;La/knf0;La/t0d;La/x0t0;La/lbu;La/gst0;La/oeg0;)V

    .line 76
    iput-object v1, p0, La/clc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/mne;La/oj9;La/b3c0;La/gst0;La/jgm0;La/q7d0;La/sjl0;La/btt0;La/vqc;)V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, La/clc;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object p6, p4

    move-object p4, p2

    move-object p2, p1

    .line 72
    new-instance p1, La/xzp;

    move-object p5, p3

    move-object p3, p9

    invoke-direct/range {p1 .. p7}, La/xzp;-><init>(La/mne;La/vqc;La/oj9;La/b3c0;La/gst0;La/sjl0;)V

    .line 73
    iput-object p1, p0, La/clc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/us00;La/dzf;La/ozf;)V
    .locals 1

    const/16 p1, 0x10

    iput-byte p1, p0, La/clc;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance p1, La/jzf;

    const/4 v0, 0x1

    invoke-direct {p1, p2, p3, v0}, La/jzf;-><init>(La/dzf;La/ozf;B)V

    .line 70
    iput-object p1, p0, La/clc;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 65
    iput-byte p2, p0, La/clc;->a:B

    iput-object p1, p0, La/clc;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/mkx;JLa/k6z;J)J
    .locals 7

    .line 1
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ikx;

    .line 10
    .line 11
    iget-wide v0, p0, La/ikx;->a:J

    .line 12
    .line 13
    iget p0, p1, La/mkx;->a:I

    .line 14
    .line 15
    const/16 v2, 0x20

    .line 16
    .line 17
    shr-long v3, v0, v2

    .line 18
    .line 19
    long-to-int v3, v3

    .line 20
    add-int/2addr p0, v3

    .line 21
    shr-long v3, p5, v2

    .line 22
    .line 23
    long-to-int v3, v3

    .line 24
    shr-long v4, p2, v2

    .line 25
    .line 26
    long-to-int v4, v4

    .line 27
    sget-object v5, La/k6z;->a:La/k6z;

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    if-ne p4, v5, :cond_0

    .line 31
    .line 32
    move p4, v6

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p4, 0x0

    .line 35
    :goto_0
    invoke-static {p0, v3, v4, p4}, La/kpb;->r(IIIZ)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    iget p1, p1, La/mkx;->b:I

    .line 40
    .line 41
    const-wide v3, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, v3

    .line 47
    long-to-int p4, v0

    .line 48
    add-int/2addr p1, p4

    .line 49
    and-long p4, p5, v3

    .line 50
    .line 51
    long-to-int p4, p4

    .line 52
    and-long/2addr p2, v3

    .line 53
    long-to-int p2, p2

    .line 54
    invoke-static {p1, p4, p2, v6}, La/kpb;->r(IIIZ)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    int-to-long p2, p0

    .line 59
    shl-long/2addr p2, v2

    .line 60
    int-to-long p0, p1

    .line 61
    and-long/2addr p0, v3

    .line 62
    or-long/2addr p0, p2

    .line 63
    return-wide p0
.end method

.method public b(La/e7z;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, La/e7z;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.add called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/mlk0;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public c(Ljava/lang/Object;)La/diu0;
    .locals 9

    .line 1
    iget-byte v0, p0, La/clc;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, La/i1w0;

    .line 8
    .line 9
    new-instance v1, La/gh70;

    .line 10
    .line 11
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/c7i;

    .line 14
    .line 15
    iget-object p0, p0, La/c7i;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/lki;

    .line 18
    .line 19
    iget-object p1, p0, La/lki;->F:La/n5d0;

    .line 20
    .line 21
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    move-object v6, p1

    .line 26
    check-cast v6, La/qa60;

    .line 27
    .line 28
    iget-object p1, p0, La/lki;->U:La/n5d0;

    .line 29
    .line 30
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    move-object v3, p1

    .line 35
    check-cast v3, La/xcc;

    .line 36
    .line 37
    iget-object p1, p0, La/lki;->x:La/n5d0;

    .line 38
    .line 39
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    move-object v2, p1

    .line 44
    check-cast v2, La/fq;

    .line 45
    .line 46
    iget-object p1, p0, La/lki;->a:La/g8i;

    .line 47
    .line 48
    invoke-virtual {p1}, La/g8i;->v1()La/mne;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget-object p0, p0, La/lki;->f:La/n5d0;

    .line 53
    .line 54
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    move-object v5, p0

    .line 59
    check-cast v5, La/lzt;

    .line 60
    .line 61
    invoke-direct/range {v1 .. v7}, La/gh70;-><init>(La/fq;La/xcc;La/mne;La/lzt;La/qa60;La/i1w0;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_0
    move-object v8, p1

    .line 66
    check-cast v8, La/i1w0;

    .line 67
    .line 68
    new-instance v2, La/gh70;

    .line 69
    .line 70
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/c7i;

    .line 73
    .line 74
    iget-object p0, p0, La/c7i;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, La/pfi;

    .line 77
    .line 78
    iget-object p1, p0, La/pfi;->F:La/n5d0;

    .line 79
    .line 80
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    move-object v7, p1

    .line 85
    check-cast v7, La/qa60;

    .line 86
    .line 87
    iget-object p1, p0, La/pfi;->U:La/n5d0;

    .line 88
    .line 89
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    move-object v4, p1

    .line 94
    check-cast v4, La/xcc;

    .line 95
    .line 96
    iget-object p1, p0, La/pfi;->x:La/n5d0;

    .line 97
    .line 98
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    move-object v3, p1

    .line 103
    check-cast v3, La/fq;

    .line 104
    .line 105
    iget-object p1, p0, La/pfi;->a:La/g8i;

    .line 106
    .line 107
    invoke-virtual {p1}, La/g8i;->v1()La/mne;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iget-object p0, p0, La/pfi;->f:La/n5d0;

    .line 112
    .line 113
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    move-object v6, p0

    .line 118
    check-cast v6, La/lzt;

    .line 119
    .line 120
    invoke-direct/range {v2 .. v8}, La/gh70;-><init>(La/fq;La/xcc;La/mne;La/lzt;La/qa60;La/i1w0;)V

    .line 121
    .line 122
    .line 123
    return-object v2

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public d()La/r46;
    .locals 2

    .line 1
    new-instance v0, La/r46;

    .line 2
    .line 3
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/epi0;

    .line 6
    .line 7
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/xzp;

    .line 10
    .line 11
    invoke-virtual {p0}, La/xzp;->C()La/r9u;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, La/r46;-><init>(La/r9u;C)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public e()La/l7m0;
    .locals 3

    .line 1
    invoke-static {}, La/qsn;->a()La/qsn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/qsn;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    new-instance p0, La/p3x;

    .line 13
    .line 14
    invoke-direct {p0, v2}, La/p3x;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, La/zuj;

    .line 25
    .line 26
    invoke-direct {v2, v1, p0}, La/zuj;-><init>(La/pz40;La/clc;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, La/qsn;->h(La/nsn;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public f()La/iw20;
    .locals 3

    .line 1
    new-instance v0, La/iw20;

    .line 2
    .line 3
    new-instance v1, La/lef0;

    .line 4
    .line 5
    new-instance v2, La/onv;

    .line 6
    .line 7
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/lgc0;

    .line 10
    .line 11
    invoke-direct {v2, p0}, La/onv;-><init>(La/lgc0;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, La/lef0;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public g(La/e7z;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, La/e7z;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DepthSortedSet.remove called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/mlk0;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 1

    .line 1
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    move-object p1, p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->h1:La/xiv0;

    .line 15
    .line 16
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iput-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->h1:La/xiv0;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object p0, p2, La/xiv0;->a:La/uiv0;

    .line 28
    .line 29
    invoke-virtual {p0}, La/uiv0;->c()La/xiv0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/clc;->a:B

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
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/mlk0;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method
