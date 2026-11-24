.class public final synthetic La/f160;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/mm40;ZZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/f160;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/f160;->d:Ljava/lang/Object;

    iput-object p2, p0, La/f160;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/f160;->b:Z

    iput-boolean p4, p0, La/f160;->c:Z

    iput-object p5, p0, La/f160;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/kgb0;La/pbv;ZLjava/lang/String;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/f160;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/f160;->d:Ljava/lang/Object;

    iput-object p2, p0, La/f160;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/f160;->b:Z

    iput-object p4, p0, La/f160;->f:Ljava/lang/Object;

    iput-boolean p5, p0, La/f160;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/f160;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/f160;->b:Z

    iput-object p2, p0, La/f160;->d:Ljava/lang/Object;

    iput-object p3, p0, La/f160;->e:Ljava/lang/Object;

    iput-object p4, p0, La/f160;->f:Ljava/lang/Object;

    iput-boolean p5, p0, La/f160;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/f160;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/f160;->f:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La/f160;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, La/f160;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v7, v4

    .line 14
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 15
    .line 16
    move-object v8, v3

    .line 17
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 18
    .line 19
    move-object v10, v2

    .line 20
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    move-object v9, p1

    .line 23
    check-cast v9, La/ypj0;

    .line 24
    .line 25
    new-instance v5, La/xpj0;

    .line 26
    .line 27
    iget-boolean v6, p0, La/f160;->b:Z

    .line 28
    .line 29
    iget-boolean v11, p0, La/f160;->c:Z

    .line 30
    .line 31
    invoke-direct/range {v5 .. v11}, La/xpj0;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ypj0;Lkotlin/jvm/functions/Function1;Z)V

    .line 32
    .line 33
    .line 34
    return-object v5

    .line 35
    :pswitch_0
    check-cast v4, La/kgb0;

    .line 36
    .line 37
    check-cast v3, La/pbv;

    .line 38
    .line 39
    move-object v10, v2

    .line 40
    check-cast v10, Ljava/lang/String;

    .line 41
    .line 42
    check-cast p1, La/k0w0;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v5, v4, La/kgb0;->U:La/uxs0;

    .line 48
    .line 49
    iget-wide v6, v3, La/pbv;->a:J

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v11, 0x6

    .line 53
    iget-boolean v9, p0, La/f160;->b:Z

    .line 54
    .line 55
    invoke-static/range {v5 .. v11}, La/uxs0;->c(La/uxs0;JLa/csr;ZLjava/lang/String;I)Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p1, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, La/c8d;

    .line 66
    .line 67
    sget-object v0, La/cfx0;->o:La/bjk;

    .line 68
    .line 69
    iget-boolean p0, p0, La/f160;->c:Z

    .line 70
    .line 71
    xor-int/2addr p0, v1

    .line 72
    new-instance v1, La/v7d;

    .line 73
    .line 74
    invoke-direct {v1, p0, v0, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p1, La/c8d;->a:La/w7d;

    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_1
    check-cast v4, La/a4x;

    .line 83
    .line 84
    check-cast v3, La/mm40;

    .line 85
    .line 86
    move-object v7, v2

    .line 87
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 88
    .line 89
    check-cast p1, La/hcz;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance v0, La/mb50;

    .line 95
    .line 96
    const/16 v2, 0x10

    .line 97
    .line 98
    invoke-direct {v0, v2}, La/mb50;-><init>(B)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    new-instance v9, La/m160;

    .line 106
    .line 107
    invoke-direct {v9, v0, v4, v1}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    new-instance v0, La/ap30;

    .line 111
    .line 112
    const/16 v2, 0x19

    .line 113
    .line 114
    invoke-direct {v0, v4, v2}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 115
    .line 116
    .line 117
    new-instance v2, La/o160;

    .line 118
    .line 119
    iget-boolean v5, p0, La/f160;->b:Z

    .line 120
    .line 121
    iget-boolean v6, p0, La/f160;->c:Z

    .line 122
    .line 123
    move-object v12, v4

    .line 124
    move-object v4, v3

    .line 125
    move-object v3, v12

    .line 126
    invoke-direct/range {v2 .. v7}, La/o160;-><init>(Ljava/util/List;La/mm40;ZZLkotlin/jvm/functions/Function1;)V

    .line 127
    .line 128
    .line 129
    new-instance p0, La/ugd;

    .line 130
    .line 131
    const v3, 0x2fd4df92

    .line 132
    .line 133
    .line 134
    invoke-direct {p0, v3, v1, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v8, v9, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 138
    .line 139
    .line 140
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
