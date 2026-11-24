.class public final synthetic La/qb50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qb50;->a:B

    iput-object p1, p0, La/qb50;->b:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/qb50;->a:B

    .line 2
    .line 3
    const-class v1, La/rb50;

    .line 4
    .line 5
    iget-object p0, p0, La/qb50;->b:Ljava/util/Set;

    .line 6
    .line 7
    check-cast p1, La/qzg0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/qaj;

    .line 16
    .line 17
    invoke-direct {v0}, La/qaj;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/sre0;->a:La/tre0;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v3, La/nw20;

    .line 27
    .line 28
    invoke-direct {v3, v1}, La/nw20;-><init>(La/sgy;)V

    .line 29
    .line 30
    .line 31
    const-class v1, La/kwv0;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v2, La/kwv0;->INSTANCE:La/kwv0;

    .line 38
    .line 39
    invoke-virtual {v2}, La/kwv0;->serializer()La/jiy;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v3, v1, v2}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 44
    .line 45
    .line 46
    check-cast p0, Ljava/lang/Iterable;

    .line 47
    .line 48
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, La/hb50;

    .line 63
    .line 64
    invoke-interface {v1, v3}, La/hb50;->a(La/nw20;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v3, v0}, La/nw20;->a(La/qaj;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, La/qaj;->b()La/qaj;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iput-object p0, p1, La/qzg0;->a:La/qaj;

    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v0, La/qaj;

    .line 87
    .line 88
    invoke-direct {v0}, La/qaj;-><init>()V

    .line 89
    .line 90
    .line 91
    sget-object v2, La/sre0;->a:La/tre0;

    .line 92
    .line 93
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    new-instance v2, La/nw20;

    .line 98
    .line 99
    invoke-direct {v2, v1}, La/nw20;-><init>(La/sgy;)V

    .line 100
    .line 101
    .line 102
    check-cast p0, Ljava/lang/Iterable;

    .line 103
    .line 104
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_1

    .line 113
    .line 114
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, La/hb50;

    .line 119
    .line 120
    invoke-interface {v1, v2}, La/hb50;->a(La/nw20;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    invoke-virtual {v2, v0}, La/nw20;->a(La/qaj;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, La/qaj;->b()La/qaj;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    iput-object p0, p1, La/qzg0;->a:La/qaj;

    .line 132
    .line 133
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
