.class public final synthetic La/q3o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/bdz;ZLa/a4x;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p8, 0x2

    iput-byte p8, p0, La/q3o;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q3o;->d:Ljava/lang/Object;

    iput-boolean p2, p0, La/q3o;->b:Z

    iput-object p3, p0, La/q3o;->e:Ljava/lang/Object;

    iput-boolean p4, p0, La/q3o;->c:Z

    iput-object p5, p0, La/q3o;->f:Ljava/lang/Object;

    iput-object p6, p0, La/q3o;->h:La/wdr;

    iput-object p7, p0, La/q3o;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/a4x;La/d9z;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    const/4 p8, 0x0

    iput-byte p8, p0, La/q3o;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q3o;->d:Ljava/lang/Object;

    iput-object p2, p0, La/q3o;->e:Ljava/lang/Object;

    iput-object p3, p0, La/q3o;->f:Ljava/lang/Object;

    iput-object p4, p0, La/q3o;->g:Ljava/lang/Object;

    iput-boolean p5, p0, La/q3o;->b:Z

    iput-boolean p6, p0, La/q3o;->c:Z

    iput-object p7, p0, La/q3o;->h:La/wdr;

    return-void
.end method

.method public synthetic constructor <init>(ZZLa/ugd;La/ugd;La/ugd;La/ugd;La/ugd;I)V
    .locals 0

    .line 3
    const/4 p8, 0x1

    iput-byte p8, p0, La/q3o;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/q3o;->b:Z

    iput-boolean p2, p0, La/q3o;->c:Z

    iput-object p3, p0, La/q3o;->d:Ljava/lang/Object;

    iput-object p4, p0, La/q3o;->e:Ljava/lang/Object;

    iput-object p5, p0, La/q3o;->f:Ljava/lang/Object;

    iput-object p6, p0, La/q3o;->g:Ljava/lang/Object;

    iput-object p7, p0, La/q3o;->h:La/wdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q3o;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/q3o;->g:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, La/q3o;->h:La/wdr;

    .line 9
    .line 10
    iget-object v5, v0, La/q3o;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, La/q3o;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v0, La/q3o;->d:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object v8, v7

    .line 20
    check-cast v8, La/bdz;

    .line 21
    .line 22
    move-object v10, v6

    .line 23
    check-cast v10, La/a4x;

    .line 24
    .line 25
    move-object v12, v5

    .line 26
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    move-object v13, v4

    .line 29
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    move-object v14, v3

    .line 32
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    move-object/from16 v15, p1

    .line 35
    .line 36
    check-cast v15, La/fet;

    .line 37
    .line 38
    move-object/from16 v1, p2

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, La/x8x;->L(I)I

    .line 46
    .line 47
    .line 48
    move-result v16

    .line 49
    iget-boolean v9, v0, La/q3o;->b:Z

    .line 50
    .line 51
    iget-boolean v11, v0, La/q3o;->c:Z

    .line 52
    .line 53
    invoke-static/range {v8 .. v16}, La/epv0;->s(La/bdz;ZLa/a4x;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    check-cast v7, La/ugd;

    .line 60
    .line 61
    check-cast v6, La/ugd;

    .line 62
    .line 63
    check-cast v5, La/ugd;

    .line 64
    .line 65
    check-cast v3, La/ugd;

    .line 66
    .line 67
    check-cast v4, La/ugd;

    .line 68
    .line 69
    move-object/from16 v8, p1

    .line 70
    .line 71
    check-cast v8, La/fet;

    .line 72
    .line 73
    move-object/from16 v1, p2

    .line 74
    .line 75
    check-cast v1, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const v1, 0x1b6d81

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, La/x8x;->L(I)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    iget-boolean v1, v0, La/q3o;->b:Z

    .line 88
    .line 89
    iget-boolean v2, v0, La/q3o;->c:Z

    .line 90
    .line 91
    move-object/from16 v17, v6

    .line 92
    .line 93
    move-object v6, v3

    .line 94
    move-object v3, v7

    .line 95
    move-object v7, v4

    .line 96
    move-object/from16 v4, v17

    .line 97
    .line 98
    invoke-static/range {v1 .. v9}, La/s5x0;->s(ZZLa/ugd;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_1
    move-object v1, v7

    .line 105
    check-cast v1, La/mm40;

    .line 106
    .line 107
    check-cast v6, La/a4x;

    .line 108
    .line 109
    check-cast v5, La/d9z;

    .line 110
    .line 111
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 112
    .line 113
    move-object v7, v4

    .line 114
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    move-object/from16 v8, p1

    .line 117
    .line 118
    check-cast v8, La/fet;

    .line 119
    .line 120
    move-object/from16 v4, p2

    .line 121
    .line 122
    check-cast v4, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, La/x8x;->L(I)I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    move-object v4, v3

    .line 132
    move-object v3, v5

    .line 133
    iget-boolean v5, v0, La/q3o;->b:Z

    .line 134
    .line 135
    iget-boolean v0, v0, La/q3o;->c:Z

    .line 136
    .line 137
    move-object v2, v6

    .line 138
    move v6, v0

    .line 139
    invoke-static/range {v1 .. v9}, La/t3o;->c(La/mm40;La/a4x;La/d9z;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
