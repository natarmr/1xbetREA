.class public final La/z2r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s2r0;


# instance fields
.field public final a:La/v7i;

.field public final b:La/j3c;

.field public final c:La/pru;

.field public final d:La/jtj;

.field public final e:La/uyn;

.field public final f:La/ocl;

.field public final g:La/reu;

.field public final h:La/jc60;

.field public final i:La/iqt;


# direct methods
.method public constructor <init>(La/v7i;La/j3c;La/pru;La/jtj;La/uyn;La/ocl;La/reu;La/jc60;La/iqt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z2r0;->a:La/v7i;

    .line 5
    .line 6
    iput-object p2, p0, La/z2r0;->b:La/j3c;

    .line 7
    .line 8
    iput-object p3, p0, La/z2r0;->c:La/pru;

    .line 9
    .line 10
    iput-object p4, p0, La/z2r0;->d:La/jtj;

    .line 11
    .line 12
    iput-object p5, p0, La/z2r0;->e:La/uyn;

    .line 13
    .line 14
    iput-object p6, p0, La/z2r0;->f:La/ocl;

    .line 15
    .line 16
    iput-object p7, p0, La/z2r0;->g:La/reu;

    .line 17
    .line 18
    iput-object p8, p0, La/z2r0;->h:La/jc60;

    .line 19
    .line 20
    iput-object p9, p0, La/z2r0;->i:La/iqt;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/t2r0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/t2r0;

    .line 7
    .line 8
    iget v1, v0, La/t2r0;->k:I

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
    iput v1, v0, La/t2r0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/t2r0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/t2r0;-><init>(La/z2r0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/t2r0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/t2r0;->k:I

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
    iget-object p1, p0, La/z2r0;->i:La/iqt;

    .line 51
    .line 52
    iget-object p1, p1, La/iqt;->a:La/gst0;

    .line 53
    .line 54
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const/4 v2, 0x0

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iput v3, v0, La/t2r0;->k:I

    .line 62
    .line 63
    iget-object p0, p0, La/z2r0;->g:La/reu;

    .line 64
    .line 65
    iget-object p0, p0, La/reu;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, La/b3c0;

    .line 68
    .line 69
    invoke-virtual {p0, v2, v0}, La/b3c0;->a(ZLa/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    check-cast p1, La/m2c0;

    .line 77
    .line 78
    iget-object p0, p1, La/m2c0;->c:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eqz p0, :cond_4

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    const/16 v2, 0xe1

    .line 92
    .line 93
    :cond_5
    :goto_2
    new-instance p0, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-direct {p0, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 96
    .line 97
    .line 98
    return-object p0
.end method

.method public final b(La/sip;ZZ)La/a1g;
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    new-instance v4, La/lie0;

    .line 4
    .line 5
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iput-wide v0, v4, La/lie0;->a:J

    .line 13
    .line 14
    new-instance v5, La/hie0;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    move/from16 v0, p3

    .line 20
    .line 21
    iput-boolean v0, v5, La/hie0;->a:Z

    .line 22
    .line 23
    iget-object v0, v2, La/z2r0;->f:La/ocl;

    .line 24
    .line 25
    iget-object v0, v0, La/ocl;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/uzc;

    .line 28
    .line 29
    invoke-virtual {v0}, La/uzc;->c()La/fnq;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/fe0;

    .line 34
    .line 35
    const/16 v3, 0x14

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    move-object/from16 v6, p1

    .line 39
    .line 40
    invoke-direct {v1, v8, v6, v2, v3}, La/fe0;-><init>(La/yje;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    new-instance v0, La/u2r0;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    move-object v3, v6

    .line 51
    move/from16 v6, p2

    .line 52
    .line 53
    invoke-direct/range {v0 .. v6}, La/u2r0;-><init>(La/yje;La/z2r0;La/sip;La/lie0;La/hie0;Z)V

    .line 54
    .line 55
    .line 56
    invoke-static {v7, v0}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    new-instance v9, La/nop0;

    .line 61
    .line 62
    const/16 v0, 0x18

    .line 63
    .line 64
    invoke-direct {v9, v2, v0}, La/nop0;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    new-instance v10, La/kie0;

    .line 68
    .line 69
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v6, La/wmq;

    .line 73
    .line 74
    const/4 v11, 0x6

    .line 75
    invoke-direct/range {v6 .. v11}, La/wmq;-><init>(La/gmq;La/yje;Lkotlin/jvm/functions/Function1;La/kie0;B)V

    .line 76
    .line 77
    .line 78
    move-object/from16 v16, v9

    .line 79
    .line 80
    new-instance v9, La/vsg0;

    .line 81
    .line 82
    invoke-direct {v9, v6}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 83
    .line 84
    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v17, 0x18

    .line 87
    .line 88
    const-string v10, "HandleCyberPopularFeedResult"

    .line 89
    .line 90
    const/4 v11, 0x3

    .line 91
    const-wide/16 v12, 0x3

    .line 92
    .line 93
    const/4 v14, 0x0

    .line 94
    invoke-static/range {v9 .. v17}, La/bkb;->i0(La/gmq;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0
.end method
