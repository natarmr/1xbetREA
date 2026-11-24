.class public final synthetic La/co;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zkz;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/co;->a:B

    iput-object p1, p0, La/co;->b:Ljava/lang/Object;

    iput-object p2, p0, La/co;->c:Ljava/lang/Object;

    iput-object p3, p0, La/co;->d:Ljava/lang/Object;

    iput-object p4, p0, La/co;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final l(La/clz;La/kkz;)V
    .locals 4

    .line 1
    iget-byte p1, p0, La/co;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/co;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/co;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, La/co;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, La/co;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/nac0;

    .line 15
    .line 16
    check-cast v2, La/cqq;

    .line 17
    .line 18
    check-cast v1, La/pkk0;

    .line 19
    .line 20
    check-cast v0, La/pz40;

    .line 21
    .line 22
    sget-object p1, La/kkz;->ON_RESUME:La/kkz;

    .line 23
    .line 24
    if-ne p2, p1, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iget-boolean p0, p0, La/nac0;->c:Z

    .line 39
    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    invoke-static {v2}, La/cqq;->a(La/cqq;)V

    .line 43
    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    check-cast v1, La/r3k;

    .line 48
    .line 49
    invoke-virtual {v1}, La/r3k;->b()V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void

    .line 53
    :pswitch_0
    check-cast p0, La/yfd;

    .line 54
    .line 55
    iget-object p1, p0, La/yfd;->e:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    check-cast v1, La/wn;

    .line 60
    .line 61
    check-cast v0, La/bsr0;

    .line 62
    .line 63
    sget-object v3, La/kkz;->ON_START:La/kkz;

    .line 64
    .line 65
    if-ne v3, p2, :cond_2

    .line 66
    .line 67
    iget-object p2, p0, La/yfd;->g:Landroid/os/Bundle;

    .line 68
    .line 69
    iget-object p0, p0, La/yfd;->f:Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    new-instance v3, La/eo;

    .line 72
    .line 73
    invoke-direct {v3, v1, v0}, La/eo;-><init>(La/wn;La/bsr0;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-interface {v1, p1}, La/wn;->a(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    const-class p0, Landroidx/activity/result/ActivityResult;

    .line 96
    .line 97
    invoke-static {p2, v2, p0}, La/knx;->P(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, Landroidx/activity/result/ActivityResult;

    .line 102
    .line 103
    if-eqz p0, :cond_4

    .line 104
    .line 105
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget p1, p0, Landroidx/activity/result/ActivityResult;->a:I

    .line 109
    .line 110
    iget-object p0, p0, Landroidx/activity/result/ActivityResult;->b:Landroid/content/Intent;

    .line 111
    .line 112
    invoke-virtual {v0, p1, p0}, La/bsr0;->i0(ILandroid/content/Intent;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-interface {v1, p0}, La/wn;->a(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_2
    sget-object v0, La/kkz;->ON_STOP:La/kkz;

    .line 121
    .line 122
    if-ne v0, p2, :cond_3

    .line 123
    .line 124
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    sget-object p1, La/kkz;->ON_DESTROY:La/kkz;

    .line 129
    .line 130
    if-ne p1, p2, :cond_4

    .line 131
    .line 132
    invoke-virtual {p0, v2}, La/yfd;->f(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    :goto_0
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
