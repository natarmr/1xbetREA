.class public Lcom/google/firebase/auth/FirebaseAuthRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic lambda$getComponents$0(La/jkd0;La/jkd0;La/jkd0;La/jkd0;La/jkd0;La/dgd;)La/zdw0;
    .locals 10

    .line 1
    const-class v0, La/nfq;

    .line 2
    .line 3
    invoke-interface {p5, v0}, La/dgd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, La/nfq;

    .line 9
    .line 10
    const-class v0, La/vmx;

    .line 11
    .line 12
    invoke-interface {p5, v0}, La/dgd;->j(Ljava/lang/Class;)La/p5d0;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-class v0, La/ktv;

    .line 17
    .line 18
    invoke-interface {p5, v0}, La/dgd;->j(Ljava/lang/Class;)La/p5d0;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    new-instance v1, La/zdw0;

    .line 23
    .line 24
    invoke-interface {p5, p0}, La/dgd;->e(La/jkd0;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    move-object v5, p0

    .line 29
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 30
    .line 31
    invoke-interface {p5, p1}, La/dgd;->e(La/jkd0;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    move-object v6, p0

    .line 36
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    invoke-interface {p5, p2}, La/dgd;->e(La/jkd0;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    move-object v7, p0

    .line 43
    check-cast v7, Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    invoke-interface {p5, p3}, La/dgd;->e(La/jkd0;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    move-object v8, p0

    .line 50
    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    .line 51
    .line 52
    invoke-interface {p5, p4}, La/dgd;->e(La/jkd0;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    move-object v9, p0

    .line 57
    check-cast v9, Ljava/util/concurrent/Executor;

    .line 58
    .line 59
    invoke-direct/range {v1 .. v9}, La/zdw0;-><init>(La/nfq;La/p5d0;La/p5d0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La/pfd;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, La/jkd0;

    .line 2
    .line 3
    const-class v0, La/cc5;

    .line 4
    .line 5
    const-class v1, Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, La/jkd0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, La/jkd0;

    .line 11
    .line 12
    const-class v2, La/sa8;

    .line 13
    .line 14
    invoke-direct {v0, v2, v1}, La/jkd0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/jkd0;

    .line 18
    .line 19
    const-class v3, La/jmz;

    .line 20
    .line 21
    invoke-direct {v2, v3, v1}, La/jkd0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    new-instance v4, La/jkd0;

    .line 25
    .line 26
    const-class v5, Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    invoke-direct {v4, v3, v5}, La/jkd0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/jkd0;

    .line 32
    .line 33
    const-class v5, La/a7t0;

    .line 34
    .line 35
    invoke-direct {v3, v5, v1}, La/jkd0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 36
    .line 37
    .line 38
    const-class v1, La/gmx;

    .line 39
    .line 40
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v5, La/ofd;

    .line 45
    .line 46
    const-class v6, La/zdw0;

    .line 47
    .line 48
    invoke-direct {v5, v6, v1}, La/ofd;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 49
    .line 50
    .line 51
    const-class v1, La/nfq;

    .line 52
    .line 53
    invoke-static {v1}, La/c7k;->c(Ljava/lang/Class;)La/c7k;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v5, v1}, La/ofd;->a(La/c7k;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, La/c7k;

    .line 61
    .line 62
    const/4 v6, 0x1

    .line 63
    const-class v7, La/ktv;

    .line 64
    .line 65
    invoke-direct {v1, v6, v6, v7}, La/c7k;-><init>(IILjava/lang/Class;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v1}, La/ofd;->a(La/c7k;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, La/c7k;

    .line 72
    .line 73
    const/4 v7, 0x0

    .line 74
    invoke-direct {v1, p0, v6, v7}, La/c7k;-><init>(La/jkd0;II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v1}, La/ofd;->a(La/c7k;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/c7k;

    .line 81
    .line 82
    invoke-direct {v1, v0, v6, v7}, La/c7k;-><init>(La/jkd0;II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v1}, La/ofd;->a(La/c7k;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, La/c7k;

    .line 89
    .line 90
    invoke-direct {v1, v2, v6, v7}, La/c7k;-><init>(La/jkd0;II)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v1}, La/ofd;->a(La/c7k;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, La/c7k;

    .line 97
    .line 98
    invoke-direct {v1, v4, v6, v7}, La/c7k;-><init>(La/jkd0;II)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v1}, La/ofd;->a(La/c7k;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, La/c7k;

    .line 105
    .line 106
    invoke-direct {v1, v3, v6, v7}, La/c7k;-><init>(La/jkd0;II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v1}, La/ofd;->a(La/c7k;)V

    .line 110
    .line 111
    .line 112
    const-class v1, La/vmx;

    .line 113
    .line 114
    invoke-static {v1}, La/c7k;->a(Ljava/lang/Class;)La/c7k;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v5, v1}, La/ofd;->a(La/c7k;)V

    .line 119
    .line 120
    .line 121
    new-instance v1, La/vkr0;

    .line 122
    .line 123
    invoke-direct {v1}, La/vkr0;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object p0, v1, La/vkr0;->b:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v0, v1, La/vkr0;->c:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v2, v1, La/vkr0;->d:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v4, v1, La/vkr0;->e:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v3, v1, La/vkr0;->f:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v1, v5, La/ofd;->f:La/jgd;

    .line 137
    .line 138
    invoke-virtual {v5}, La/ofd;->b()La/pfd;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    new-instance v0, La/jtv;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    const-class v1, La/jtv;

    .line 148
    .line 149
    invoke-static {v1}, La/pfd;->b(Ljava/lang/Class;)La/ofd;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iput-boolean v6, v1, La/ofd;->e:Z

    .line 154
    .line 155
    new-instance v2, La/nfd;

    .line 156
    .line 157
    invoke-direct {v2, v0, v7}, La/nfd;-><init>(Ljava/lang/Object;B)V

    .line 158
    .line 159
    .line 160
    iput-object v2, v1, La/ofd;->f:La/jgd;

    .line 161
    .line 162
    invoke-virtual {v1}, La/ofd;->b()La/pfd;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const-string v1, "fire-auth"

    .line 167
    .line 168
    const-string v2, "24.2.0"

    .line 169
    .line 170
    invoke-static {v1, v2}, La/q0x;->I(Ljava/lang/String;Ljava/lang/String;)La/pfd;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    filled-new-array {p0, v0, v1}, [La/pfd;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0
.end method
