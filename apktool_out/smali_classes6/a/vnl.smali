.class public final synthetic La/vnl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/b0i;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/b0i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/vnl;->a:B

    iput-object p1, p0, La/vnl;->b:Ljava/util/List;

    iput-object p2, p0, La/vnl;->c:La/b0i;

    iput-object p3, p0, La/vnl;->d:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/vnl;->e:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/vnl;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v2, p1

    .line 8
    check-cast v2, La/i8z;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p1, La/j2l;

    .line 14
    .line 15
    const/16 v0, 0x11

    .line 16
    .line 17
    invoke-direct {p1, v0}, La/j2l;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iget-object v4, p0, La/vnl;->b:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-instance v9, La/vtf;

    .line 27
    .line 28
    const/16 v3, 0x1b

    .line 29
    .line 30
    invoke-direct {v9, p1, v4, v3}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    new-instance p1, La/bzh;

    .line 34
    .line 35
    const/16 v3, 0xb

    .line 36
    .line 37
    invoke-direct {p1, v4, v3}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 38
    .line 39
    .line 40
    new-instance v3, La/ynl;

    .line 41
    .line 42
    const/4 v8, 0x1

    .line 43
    iget-object v5, p0, La/vnl;->c:La/b0i;

    .line 44
    .line 45
    iget-object v6, p0, La/vnl;->d:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    iget-object v7, p0, La/vnl;->e:Lkotlin/jvm/functions/Function2;

    .line 48
    .line 49
    invoke-direct/range {v3 .. v8}, La/ynl;-><init>(Ljava/util/List;La/b0i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;B)V

    .line 50
    .line 51
    .line 52
    new-instance v7, La/ugd;

    .line 53
    .line 54
    const p0, -0x73c450aa

    .line 55
    .line 56
    .line 57
    invoke-direct {v7, p0, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    move-object v6, p1

    .line 62
    move v3, v0

    .line 63
    move-object v4, v9

    .line 64
    invoke-virtual/range {v2 .. v7}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_0
    check-cast p1, La/hcz;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance v0, La/j2l;

    .line 76
    .line 77
    const/16 v2, 0x10

    .line 78
    .line 79
    invoke-direct {v0, v2}, La/j2l;-><init>(B)V

    .line 80
    .line 81
    .line 82
    iget-object v4, p0, La/vnl;->b:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    new-instance v9, La/vtf;

    .line 89
    .line 90
    const/16 v3, 0x1a

    .line 91
    .line 92
    invoke-direct {v9, v0, v4, v3}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    new-instance v0, La/bzh;

    .line 96
    .line 97
    const/16 v3, 0xa

    .line 98
    .line 99
    invoke-direct {v0, v4, v3}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 100
    .line 101
    .line 102
    new-instance v3, La/ynl;

    .line 103
    .line 104
    const/4 v8, 0x0

    .line 105
    iget-object v5, p0, La/vnl;->c:La/b0i;

    .line 106
    .line 107
    iget-object v6, p0, La/vnl;->d:Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    iget-object v7, p0, La/vnl;->e:Lkotlin/jvm/functions/Function2;

    .line 110
    .line 111
    invoke-direct/range {v3 .. v8}, La/ynl;-><init>(Ljava/util/List;La/b0i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;B)V

    .line 112
    .line 113
    .line 114
    new-instance p0, La/ugd;

    .line 115
    .line 116
    const v4, 0x799532c4

    .line 117
    .line 118
    .line 119
    invoke-direct {p0, v4, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v2, v9, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
