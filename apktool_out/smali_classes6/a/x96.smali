.class public final synthetic La/x96;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/pz40;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/x96;->a:B

    iput-object p1, p0, La/x96;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/x96;->c:La/pz40;

    iput-object p3, p0, La/x96;->d:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/x96;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/x96;->d:La/pz40;

    .line 4
    .line 5
    iget-object v2, p0, La/x96;->c:La/pz40;

    .line 6
    .line 7
    iget-object p0, p0, La/x96;->b:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/u3i;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v0, p1, La/v3i;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v0, La/ydm;

    .line 22
    .line 23
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    check-cast p1, La/v3i;

    .line 44
    .line 45
    invoke-direct {v0, v2, v3, v1, p1}, La/ydm;-><init>(JZLa/v3i;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    instance-of v0, p1, La/x3i;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    new-instance v0, La/zdm;

    .line 57
    .line 58
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    check-cast p1, La/x3i;

    .line 79
    .line 80
    invoke-direct {v0, v2, v3, v1, p1}, La/zdm;-><init>(JZLa/x3i;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    instance-of v0, p1, La/z3i;

    .line 88
    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    new-instance v0, La/aem;

    .line 92
    .line 93
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    check-cast p1, La/z3i;

    .line 114
    .line 115
    invoke-direct {v0, v2, v3, v1, p1}, La/aem;-><init>(JZLa/z3i;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_0
    check-cast p1, La/a8q0;

    .line 125
    .line 126
    invoke-interface {v2, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Ljava/lang/String;

    .line 134
    .line 135
    iget-object v2, p1, La/a8q0;->a:La/j83;

    .line 136
    .line 137
    iget-object v2, v2, La/j83;->b:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    iget-object p1, p1, La/a8q0;->a:La/j83;

    .line 144
    .line 145
    iget-object v2, p1, La/j83;->b:Ljava/lang/String;

    .line 146
    .line 147
    invoke-interface {v1, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    if-nez v0, :cond_3

    .line 151
    .line 152
    iget-object p1, p1, La/j83;->b:Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    :cond_3
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
