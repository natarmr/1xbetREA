.class public final synthetic La/psv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/fuj0;

.field public final synthetic d:La/w6k;

.field public final synthetic e:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/zbk;La/fuj0;La/w6k;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/psv0;->a:B

    iput-object p1, p0, La/psv0;->b:La/l7m0;

    iput-object p2, p0, La/psv0;->c:La/fuj0;

    iput-object p3, p0, La/psv0;->d:La/w6k;

    iput-object p4, p0, La/psv0;->e:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/psv0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/psv0;->e:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v11, p1

    .line 12
    check-cast v11, La/fet;

    .line 13
    .line 14
    move-object/from16 v0, p2

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    and-int/lit8 v5, v0, 0x3

    .line 23
    .line 24
    if-eq v5, v2, :cond_0

    .line 25
    .line 26
    move v1, v3

    .line 27
    :cond_0
    and-int/2addr v0, v3

    .line 28
    invoke-virtual {v11, v0, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    sget-object v6, La/tsv0;->a:La/tsv0;

    .line 35
    .line 36
    new-instance v0, La/qyl;

    .line 37
    .line 38
    const/4 v1, 0x6

    .line 39
    invoke-direct {v0, v4, v1}, La/qyl;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 40
    .line 41
    .line 42
    const v1, -0x416be4c5

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v0, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    const v12, 0x30030

    .line 50
    .line 51
    .line 52
    const/4 v13, 0x1

    .line 53
    const/4 v5, 0x0

    .line 54
    iget-object v7, p0, La/psv0;->b:La/l7m0;

    .line 55
    .line 56
    iget-object v8, p0, La/psv0;->c:La/fuj0;

    .line 57
    .line 58
    iget-object v9, p0, La/psv0;->d:La/w6k;

    .line 59
    .line 60
    invoke-static/range {v5 .. v13}, La/qsm0;->q(La/mm40;La/tsv0;La/l7m0;La/fuj0;La/w6k;La/ugd;La/fet;II)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v11}, La/fet;->X()V

    .line 65
    .line 66
    .line 67
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_0
    move-object v6, p1

    .line 71
    check-cast v6, La/fet;

    .line 72
    .line 73
    move-object/from16 v0, p2

    .line 74
    .line 75
    check-cast v0, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    and-int/lit8 v5, v0, 0x3

    .line 82
    .line 83
    if-eq v5, v2, :cond_2

    .line 84
    .line 85
    move v1, v3

    .line 86
    :cond_2
    and-int/2addr v0, v3

    .line 87
    invoke-virtual {v6, v0, v1}, La/fet;->U(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    sget-object v1, La/tsv0;->c:La/tsv0;

    .line 94
    .line 95
    new-instance v0, La/qyl;

    .line 96
    .line 97
    const/4 v2, 0x7

    .line 98
    invoke-direct {v0, v4, v2}, La/qyl;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 99
    .line 100
    .line 101
    const v2, 0x102cbb63

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v0, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    const v7, 0x30030

    .line 109
    .line 110
    .line 111
    const/4 v8, 0x1

    .line 112
    const/4 v0, 0x0

    .line 113
    iget-object v2, p0, La/psv0;->b:La/l7m0;

    .line 114
    .line 115
    iget-object v3, p0, La/psv0;->c:La/fuj0;

    .line 116
    .line 117
    iget-object v4, p0, La/psv0;->d:La/w6k;

    .line 118
    .line 119
    invoke-static/range {v0 .. v8}, La/qsm0;->q(La/mm40;La/tsv0;La/l7m0;La/fuj0;La/w6k;La/ugd;La/fet;II)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    invoke-virtual {v6}, La/fet;->X()V

    .line 124
    .line 125
    .line 126
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
