.class public final synthetic La/uhx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/edu;

.field public final synthetic c:La/r9u;

.field public final synthetic d:La/pru;


# direct methods
.method public synthetic constructor <init>(La/edu;La/r9u;La/pru;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/uhx;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uhx;->b:La/edu;

    iput-object p2, p0, La/uhx;->c:La/r9u;

    iput-object p3, p0, La/uhx;->d:La/pru;

    return-void
.end method

.method public synthetic constructor <init>(La/pru;La/edu;La/r9u;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/uhx;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uhx;->d:La/pru;

    iput-object p2, p0, La/uhx;->b:La/edu;

    iput-object p3, p0, La/uhx;->c:La/r9u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/uhx;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/uhx;->d:La/pru;

    .line 4
    .line 5
    iget-object v2, p0, La/uhx;->c:La/r9u;

    .line 6
    .line 7
    iget-object p0, p0, La/uhx;->b:La/edu;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v4, La/iun;->a:La/iun;

    .line 13
    .line 14
    sget-object v5, La/lun;->a:La/lun;

    .line 15
    .line 16
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/edu;->g()La/aw20;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    sget-object p0, La/ygp;->t:La/ygp;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, v2, La/r9u;->a:La/j1q0;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, La/m1q0;->d(La/ygp;)Z

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object v12, p0, La/sff0;->I1:La/oxk0;

    .line 44
    .line 45
    new-instance v3, La/m730;

    .line 46
    .line 47
    const-wide/16 v7, -0x1

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-direct/range {v3 .. v12}, La/m730;-><init>(Ljava/util/List;Ljava/util/Map;La/l9s;JLa/aw20;ZLa/ycs;La/oxk0;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :pswitch_0
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v4, La/iun;->a:La/iun;

    .line 60
    .line 61
    new-instance v8, La/mhx;

    .line 62
    .line 63
    iget-object v1, v0, La/sff0;->h1:La/udl0;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    if-eq v1, v3, :cond_2

    .line 73
    .line 74
    const/4 v3, 0x2

    .line 75
    if-eq v1, v3, :cond_1

    .line 76
    .line 77
    const/4 v3, 0x3

    .line 78
    if-ne v1, v3, :cond_0

    .line 79
    .line 80
    sget-object v1, La/udl0;->e:La/udl0;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    sget-object v1, La/udl0;->d:La/udl0;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    sget-object v1, La/udl0;->c:La/udl0;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    sget-object v1, La/udl0;->b:La/udl0;

    .line 95
    .line 96
    :goto_0
    iget-boolean v0, v0, La/sff0;->J1:Z

    .line 97
    .line 98
    invoke-direct {v8, v1, v0}, La/mhx;-><init>(La/udl0;Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/edu;->g()La/aw20;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    sget-object p0, La/ygp;->t:La/ygp;

    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v0, v2, La/r9u;->a:La/j1q0;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 116
    .line 117
    invoke-virtual {v0, p0}, La/m1q0;->d(La/ygp;)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    new-instance v3, La/ohx;

    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    const/4 v7, 0x1

    .line 125
    move-object v5, v4

    .line 126
    invoke-direct/range {v3 .. v10}, La/ohx;-><init>(Ljava/util/List;Ljava/util/List;La/l9s;ZLa/mhx;La/aw20;Z)V

    .line 127
    .line 128
    .line 129
    move-object p0, v3

    .line 130
    :goto_1
    return-object p0

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
