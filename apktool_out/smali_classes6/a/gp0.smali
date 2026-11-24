.class public final synthetic La/gp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pp0;

.field public final synthetic c:La/mm40;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/pp0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/gp0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gp0;->c:La/mm40;

    iput-object p2, p0, La/gp0;->b:La/pp0;

    iput-object p3, p0, La/gp0;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(La/pp0;La/mm40;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/gp0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gp0;->b:La/pp0;

    iput-object p2, p0, La/gp0;->c:La/mm40;

    iput-object p3, p0, La/gp0;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gp0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x0

    .line 7
    const v4, 0x7f080913

    .line 8
    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/16 v6, 0x10

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v8, v0, La/gp0;->b:La/pp0;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/g9z;

    .line 22
    .line 23
    move-object/from16 v9, p2

    .line 24
    .line 25
    check-cast v9, La/fet;

    .line 26
    .line 27
    move-object/from16 v10, p3

    .line 28
    .line 29
    check-cast v10, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    and-int/lit8 v1, v10, 0x11

    .line 39
    .line 40
    if-eq v1, v6, :cond_0

    .line 41
    .line 42
    move v5, v7

    .line 43
    :cond_0
    and-int/lit8 v1, v10, 0x1

    .line 44
    .line 45
    invoke-virtual {v9, v1, v5}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    check-cast v8, La/np0;

    .line 52
    .line 53
    iget-object v10, v8, La/np0;->c:Ljava/lang/String;

    .line 54
    .line 55
    new-instance v11, La/m0x;

    .line 56
    .line 57
    invoke-direct {v11, v4, v3, v2}, La/m0x;-><init>(ILa/bzw;I)V

    .line 58
    .line 59
    .line 60
    iget-boolean v1, v8, La/np0;->d:Z

    .line 61
    .line 62
    iget-wide v12, v8, La/np0;->g:J

    .line 63
    .line 64
    iget-wide v14, v8, La/np0;->f:J

    .line 65
    .line 66
    const/16 v19, 0x0

    .line 67
    .line 68
    move-object/from16 v18, v9

    .line 69
    .line 70
    iget-object v9, v0, La/gp0;->c:La/mm40;

    .line 71
    .line 72
    iget-object v0, v0, La/gp0;->d:Lkotlin/jvm/functions/Function0;

    .line 73
    .line 74
    move-object/from16 v17, v0

    .line 75
    .line 76
    move/from16 v16, v1

    .line 77
    .line 78
    invoke-static/range {v9 .. v19}, La/xia0;->B(La/mm40;Ljava/lang/String;La/m0x;JJZLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    move-object/from16 v18, v9

    .line 83
    .line 84
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 85
    .line 86
    .line 87
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_0
    move-object/from16 v1, p1

    .line 91
    .line 92
    check-cast v1, La/g9z;

    .line 93
    .line 94
    move-object/from16 v14, p2

    .line 95
    .line 96
    check-cast v14, La/fet;

    .line 97
    .line 98
    move-object/from16 v9, p3

    .line 99
    .line 100
    check-cast v9, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    and-int/lit8 v1, v9, 0x11

    .line 110
    .line 111
    if-eq v1, v6, :cond_2

    .line 112
    .line 113
    move v5, v7

    .line 114
    :cond_2
    and-int/lit8 v1, v9, 0x1

    .line 115
    .line 116
    invoke-virtual {v14, v1, v5}, La/fet;->U(IZ)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_3

    .line 121
    .line 122
    check-cast v8, La/np0;

    .line 123
    .line 124
    iget-object v10, v8, La/np0;->c:Ljava/lang/String;

    .line 125
    .line 126
    new-instance v11, La/m0x;

    .line 127
    .line 128
    invoke-direct {v11, v4, v3, v2}, La/m0x;-><init>(ILa/bzw;I)V

    .line 129
    .line 130
    .line 131
    iget-boolean v12, v8, La/np0;->d:Z

    .line 132
    .line 133
    const/4 v15, 0x0

    .line 134
    iget-object v9, v0, La/gp0;->c:La/mm40;

    .line 135
    .line 136
    iget-object v13, v0, La/gp0;->d:Lkotlin/jvm/functions/Function0;

    .line 137
    .line 138
    invoke-static/range {v9 .. v15}, La/nia0;->H(La/mm40;Ljava/lang/String;La/m0x;ZLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    invoke-virtual {v14}, La/fet;->X()V

    .line 143
    .line 144
    .line 145
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object v0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
