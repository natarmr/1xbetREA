.class public final synthetic La/lk7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function1;La/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/lk7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lk7;->b:La/l7m0;

    iput-object p2, p0, La/lk7;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/lk7;->d:La/l7m0;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/lk7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lk7;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/lk7;->b:La/l7m0;

    iput-object p3, p0, La/lk7;->d:La/l7m0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/lk7;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, La/lk7;->d:La/l7m0;

    .line 11
    .line 12
    iget-object v7, p0, La/lk7;->b:La/l7m0;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v9, p1

    .line 18
    check-cast v9, La/fet;

    .line 19
    .line 20
    move-object/from16 v0, p2

    .line 21
    .line 22
    check-cast v0, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    and-int/lit8 v8, v0, 0x3

    .line 29
    .line 30
    if-eq v8, v4, :cond_0

    .line 31
    .line 32
    move v3, v5

    .line 33
    :cond_0
    and-int/2addr v0, v5

    .line 34
    invoke-virtual {v9, v0, v3}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-static {v2, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/uc7;

    .line 49
    .line 50
    iget-object v11, v0, La/uc7;->d:La/l7m0;

    .line 51
    .line 52
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/l7m0;

    .line 57
    .line 58
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v12, v0

    .line 63
    check-cast v12, Ljava/lang/String;

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    iget-object v13, p0, La/lk7;->c:Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    invoke-static/range {v8 .. v13}, La/w9x;->a(ILa/fet;La/mm40;La/l7m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {v9}, La/fet;->X()V

    .line 73
    .line 74
    .line 75
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_0
    move-object v0, p1

    .line 79
    check-cast v0, La/fet;

    .line 80
    .line 81
    move-object/from16 v8, p2

    .line 82
    .line 83
    check-cast v8, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    and-int/lit8 v9, v8, 0x3

    .line 90
    .line 91
    if-eq v9, v4, :cond_2

    .line 92
    .line 93
    move v3, v5

    .line 94
    :cond_2
    and-int/lit8 v4, v8, 0x1

    .line 95
    .line 96
    invoke-virtual {v0, v4, v3}, La/fet;->U(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    invoke-static {v2, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, La/l7m0;

    .line 111
    .line 112
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    move-object v4, v1

    .line 117
    check-cast v4, Ljava/lang/String;

    .line 118
    .line 119
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    move-object v3, v1

    .line 124
    check-cast v3, La/l7m0;

    .line 125
    .line 126
    move-object v1, v0

    .line 127
    const/4 v0, 0x6

    .line 128
    iget-object v5, p0, La/lk7;->c:Lkotlin/jvm/functions/Function1;

    .line 129
    .line 130
    invoke-static/range {v0 .. v5}, La/p7x;->j(ILa/fet;La/mm40;La/l7m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    move-object v1, v0

    .line 135
    invoke-virtual {v1}, La/fet;->X()V

    .line 136
    .line 137
    .line 138
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
