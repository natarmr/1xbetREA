.class public final synthetic La/tpv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tpv0;->a:B

    iput-object p1, p0, La/tpv0;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/tpv0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/tpv0;->b:Ljava/lang/String;

    .line 6
    .line 7
    check-cast p1, La/qpg0;

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
    const-string v0, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?"

    .line 16
    .line 17
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :try_start_0
    invoke-interface {p1, v2, p0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-interface {p1}, La/xpg0;->W0()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-interface {p1, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v0, "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?"

    .line 57
    .line 58
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :try_start_1
    invoke-interface {v0, v2, p0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, La/xpg0;->W0()Z

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, La/s0x;->R(La/qpg0;)I

    .line 69
    .line 70
    .line 71
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :catchall_1
    move-exception p0

    .line 81
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const-string v0, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 89
    .line 90
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :try_start_2
    invoke-interface {p1, v2, p0}, La/xpg0;->z(ILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    new-instance p0, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    :goto_2
    invoke-interface {p1}, La/xpg0;->W0()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_1

    .line 107
    .line 108
    invoke-interface {p1, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :catchall_2
    move-exception p0

    .line 117
    goto :goto_3

    .line 118
    :cond_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :goto_3
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
