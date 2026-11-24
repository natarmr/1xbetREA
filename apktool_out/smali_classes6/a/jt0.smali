.class public final synthetic La/jt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/cgk0;


# direct methods
.method public synthetic constructor <init>(La/cgk0;La/pz40;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/jt0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jt0;->c:La/cgk0;

    iput-object p2, p0, La/jt0;->b:La/pz40;

    return-void
.end method

.method public synthetic constructor <init>(La/pz40;La/cgk0;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/jt0;->a:B

    iput-object p1, p0, La/jt0;->b:La/pz40;

    iput-object p2, p0, La/jt0;->c:La/cgk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/jt0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/jt0;->c:La/cgk0;

    .line 5
    .line 6
    iget-object p0, p0, La/jt0;->b:La/pz40;

    .line 7
    .line 8
    check-cast p1, La/abi0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    sget-object v0, La/etl;->c:La/zai0;

    .line 26
    .line 27
    sget-object v3, La/etl;->a:[La/iiy;

    .line 28
    .line 29
    aget-object v1, v3, v1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-static {p1, p0}, La/etl;->g(La/abi0;I)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    sget-object v0, La/etl;->c:La/zai0;

    .line 57
    .line 58
    sget-object v3, La/etl;->a:[La/iiy;

    .line 59
    .line 60
    aget-object v1, v3, v1

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-static {p1, p0}, La/etl;->g(La/abi0;I)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    sget-object v0, La/etl;->c:La/zai0;

    .line 88
    .line 89
    sget-object v3, La/etl;->a:[La/iiy;

    .line 90
    .line 91
    aget-object v1, v3, v1

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-static {p1, p0}, La/etl;->g(La/abi0;I)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_2
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    sget-object v1, La/lt0;->b:La/zai0;

    .line 114
    .line 115
    sget-object v2, La/lt0;->a:[La/iiy;

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    aget-object v2, v2, v3

    .line 119
    .line 120
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-interface {p1, v1, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-object v0, La/cbi0;->m:La/zai0;

    .line 131
    .line 132
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
