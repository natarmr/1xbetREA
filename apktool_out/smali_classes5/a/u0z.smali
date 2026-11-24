.class public final synthetic La/u0z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:La/cgk0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(BLa/a4x;La/cgk0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/u0z;->a:B

    iput-object p2, p0, La/u0z;->b:La/a4x;

    iput-object p3, p0, La/u0z;->c:La/cgk0;

    iput-object p4, p0, La/u0z;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/u0z;->a:B

    .line 2
    .line 3
    const v1, 0x2fd4df92

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/u0z;->d:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iget-object v5, p0, La/u0z;->c:La/cgk0;

    .line 11
    .line 12
    iget-object p0, p0, La/u0z;->b:La/a4x;

    .line 13
    .line 14
    const/4 v6, 0x3

    .line 15
    const/4 v7, 0x1

    .line 16
    check-cast p1, La/hcz;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, La/f1z;

    .line 39
    .line 40
    new-instance v8, La/d2s;

    .line 41
    .line 42
    const/4 v9, 0x6

    .line 43
    invoke-direct {v8, v0, v5, v9}, La/d2s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    new-instance v9, La/ugd;

    .line 47
    .line 48
    const v10, -0x6bce5876

    .line 49
    .line 50
    .line 51
    invoke-direct {v9, v10, v7, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v9, v6}, La/hcz;->h(La/hcz;La/ugd;I)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, La/f1z;->b:La/a4x;

    .line 58
    .line 59
    new-instance v8, La/djx;

    .line 60
    .line 61
    const/16 v9, 0x16

    .line 62
    .line 63
    invoke-direct {v8, v9}, La/djx;-><init>(B)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    new-instance v10, La/ygy;

    .line 71
    .line 72
    invoke-direct {v10, v8, v0, v2}, La/ygy;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    new-instance v8, La/a1z;

    .line 76
    .line 77
    invoke-direct {v8, v7, v0, v5, v4}, La/a1z;-><init>(BLa/a4x;La/cgk0;Lkotlin/jvm/functions/Function1;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, La/ugd;

    .line 81
    .line 82
    invoke-direct {v0, v1, v7, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v9, v3, v10, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, La/e1z;

    .line 107
    .line 108
    new-instance v8, La/d2s;

    .line 109
    .line 110
    invoke-direct {v8, v0, v5, v2}, La/d2s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    new-instance v9, La/ugd;

    .line 114
    .line 115
    const v10, -0x37025ab3

    .line 116
    .line 117
    .line 118
    invoke-direct {v9, v10, v7, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1, v9, v6}, La/hcz;->h(La/hcz;La/ugd;I)V

    .line 122
    .line 123
    .line 124
    iget-object v0, v0, La/e1z;->b:La/a4x;

    .line 125
    .line 126
    new-instance v8, La/djx;

    .line 127
    .line 128
    const/16 v9, 0x15

    .line 129
    .line 130
    invoke-direct {v8, v9}, La/djx;-><init>(B)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    new-instance v10, La/ygy;

    .line 138
    .line 139
    invoke-direct {v10, v8, v0, v6}, La/ygy;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 140
    .line 141
    .line 142
    new-instance v8, La/a1z;

    .line 143
    .line 144
    const/4 v11, 0x0

    .line 145
    invoke-direct {v8, v11, v0, v5, v4}, La/a1z;-><init>(BLa/a4x;La/cgk0;Lkotlin/jvm/functions/Function1;)V

    .line 146
    .line 147
    .line 148
    new-instance v0, La/ugd;

    .line 149
    .line 150
    invoke-direct {v0, v1, v7, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v9, v3, v10, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
