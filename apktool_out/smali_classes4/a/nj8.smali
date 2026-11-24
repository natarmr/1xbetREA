.class public final synthetic La/nj8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qj8;


# direct methods
.method public synthetic constructor <init>(La/qj8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nj8;->a:B

    iput-object p1, p0, La/nj8;->b:La/qj8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/nj8;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nj8;->b:La/qj8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p0, p0, La/qj8;->e:La/a4x;

    .line 15
    .line 16
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sget-object v0, La/sre0;->a:La/tre0;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0}, La/sgy;->J()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p1, p0}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast p1, La/hcz;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v0, La/oj8;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, v1}, La/oj8;-><init>(La/qj8;B)V

    .line 48
    .line 49
    .line 50
    new-instance v2, La/ugd;

    .line 51
    .line 52
    const v3, -0x8bb9778

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    invoke-direct {v2, v3, v4, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    const/4 v3, 0x3

    .line 61
    invoke-static {p1, v0, v0, v2, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 62
    .line 63
    .line 64
    new-instance v2, La/oj8;

    .line 65
    .line 66
    invoke-direct {v2, p0, v4}, La/oj8;-><init>(La/qj8;B)V

    .line 67
    .line 68
    .line 69
    new-instance v5, La/ugd;

    .line 70
    .line 71
    const v6, -0x12abfd01

    .line 72
    .line 73
    .line 74
    invoke-direct {v5, v6, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v0, v0, v5, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, La/qj8;->e:La/a4x;

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    new-instance v2, La/nj8;

    .line 87
    .line 88
    const/4 v3, 0x2

    .line 89
    invoke-direct {v2, p0, v3}, La/nj8;-><init>(La/qj8;B)V

    .line 90
    .line 91
    .line 92
    new-instance v3, La/nj8;

    .line 93
    .line 94
    invoke-direct {v3, p0, v1}, La/nj8;-><init>(La/qj8;B)V

    .line 95
    .line 96
    .line 97
    new-instance v1, La/awh;

    .line 98
    .line 99
    const/4 v5, 0x4

    .line 100
    invoke-direct {v1, p0, v5}, La/awh;-><init>(Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    new-instance p0, La/ugd;

    .line 104
    .line 105
    const v5, 0x7b67cd91

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, v5, v4, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0, v2, v3, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    iget-object p0, p0, La/qj8;->e:La/a4x;

    .line 124
    .line 125
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    sget-object p1, La/sre0;->a:La/tre0;

    .line 134
    .line 135
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
