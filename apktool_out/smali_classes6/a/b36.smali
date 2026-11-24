.class public final synthetic La/b36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;


# direct methods
.method public synthetic constructor <init>(ZLa/pz40;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/b36;->a:B

    iput-boolean p1, p0, La/b36;->b:Z

    iput-object p2, p0, La/b36;->c:La/pz40;

    iput-object p3, p0, La/b36;->d:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/b36;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/b36;->d:La/pz40;

    .line 4
    .line 5
    iget-object v2, p0, La/b36;->c:La/pz40;

    .line 6
    .line 7
    iget-boolean p0, p0, La/b36;->b:Z

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/a9q0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, La/a9q0;->m(I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {v2, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-wide p0, La/qmk;->w:J

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    sget-wide p0, La/qmk;->u:J

    .line 48
    .line 49
    :goto_1
    new-instance v0, La/daq0;

    .line 50
    .line 51
    invoke-direct {v0, p0, p1}, La/daq0;-><init>(J)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_0
    check-cast p1, La/iqq;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v2, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    if-eqz p0, :cond_2

    .line 95
    .line 96
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, La/a8q0;

    .line 101
    .line 102
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, La/a8q0;

    .line 107
    .line 108
    iget-object p1, p1, La/a8q0;->a:La/j83;

    .line 109
    .line 110
    iget-object p1, p1, La/j83;->b:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    invoke-static {p1, p1}, La/s7n0;->e(II)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    const/4 p1, 0x5

    .line 121
    const/4 v0, 0x0

    .line 122
    invoke-static {p0, v0, v2, v3, p1}, La/a8q0;->a(La/a8q0;La/j83;JI)La/a8q0;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-interface {v1, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
