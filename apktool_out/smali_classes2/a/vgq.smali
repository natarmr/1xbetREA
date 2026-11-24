.class public final La/vgq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5d0;


# instance fields
.field public final synthetic a:B

.field public final b:La/n5d0;

.field public final c:La/n5d0;

.field public final d:La/n5d0;

.field public final e:La/n5d0;

.field public final f:La/n5d0;

.field public final g:La/n5d0;

.field public final h:La/n5d0;


# direct methods
.method public constructor <init>(La/svs0;La/n5d0;La/n5d0;La/n5d0;La/n5d0;La/n5d0;La/n5d0;La/n5d0;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-byte p1, p0, La/vgq;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/vgq;->b:La/n5d0;

    .line 8
    .line 9
    iput-object p3, p0, La/vgq;->c:La/n5d0;

    .line 10
    .line 11
    iput-object p4, p0, La/vgq;->d:La/n5d0;

    .line 12
    .line 13
    iput-object p5, p0, La/vgq;->e:La/n5d0;

    .line 14
    .line 15
    iput-object p6, p0, La/vgq;->f:La/n5d0;

    .line 16
    .line 17
    iput-object p7, p0, La/vgq;->g:La/n5d0;

    .line 18
    .line 19
    iput-object p8, p0, La/vgq;->h:La/n5d0;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(La/ugq;La/ugq;La/ugq;La/ugq;La/p8i;La/p8i;La/p8i;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/vgq;->a:B

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, La/vgq;->b:La/n5d0;

    .line 24
    iput-object p2, p0, La/vgq;->c:La/n5d0;

    .line 25
    iput-object p3, p0, La/vgq;->d:La/n5d0;

    .line 26
    iput-object p4, p0, La/vgq;->e:La/n5d0;

    .line 27
    iput-object p5, p0, La/vgq;->f:La/n5d0;

    .line 28
    iput-object p6, p0, La/vgq;->g:La/n5d0;

    .line 29
    iput-object p7, p0, La/vgq;->h:La/n5d0;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/vgq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/vgq;->h:La/n5d0;

    .line 4
    .line 5
    iget-object v2, p0, La/vgq;->g:La/n5d0;

    .line 6
    .line 7
    iget-object v3, p0, La/vgq;->f:La/n5d0;

    .line 8
    .line 9
    iget-object v4, p0, La/vgq;->e:La/n5d0;

    .line 10
    .line 11
    iget-object v5, p0, La/vgq;->d:La/n5d0;

    .line 12
    .line 13
    iget-object v6, p0, La/vgq;->c:La/n5d0;

    .line 14
    .line 15
    iget-object p0, p0, La/vgq;->b:La/n5d0;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    move-object v8, p0

    .line 25
    check-cast v8, La/d5w0;

    .line 26
    .line 27
    invoke-interface {v6}, La/o5d0;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    move-object v9, p0

    .line 32
    check-cast v9, La/b5w0;

    .line 33
    .line 34
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    move-object v13, p0

    .line 39
    check-cast v13, La/f5w0;

    .line 40
    .line 41
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    move-object v10, p0

    .line 46
    check-cast v10, La/bwt;

    .line 47
    .line 48
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    move-object v11, p0

    .line 53
    check-cast v11, La/izx;

    .line 54
    .line 55
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    move-object v12, p0

    .line 60
    check-cast v12, La/wo10;

    .line 61
    .line 62
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    move-object v14, p0

    .line 67
    check-cast v14, La/y2w0;

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v7, La/cyh;

    .line 91
    .line 92
    invoke-direct/range {v7 .. v14}, La/cyh;-><init>(La/d5w0;La/b5w0;La/bwt;La/izx;La/wo10;La/f5w0;La/y2w0;)V

    .line 93
    .line 94
    .line 95
    return-object v7

    .line 96
    :pswitch_0
    check-cast p0, La/ugq;

    .line 97
    .line 98
    invoke-virtual {p0}, La/ugq;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    move-object v8, p0

    .line 103
    check-cast v8, La/nfq;

    .line 104
    .line 105
    check-cast v6, La/ugq;

    .line 106
    .line 107
    invoke-virtual {v6}, La/ugq;->get()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    move-object v9, p0

    .line 112
    check-cast v9, La/p5d0;

    .line 113
    .line 114
    check-cast v5, La/ugq;

    .line 115
    .line 116
    invoke-virtual {v5}, La/ugq;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    move-object v10, p0

    .line 121
    check-cast v10, La/dgq;

    .line 122
    .line 123
    check-cast v4, La/ugq;

    .line 124
    .line 125
    invoke-virtual {v4}, La/ugq;->get()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    move-object v11, p0

    .line 130
    check-cast v11, La/p5d0;

    .line 131
    .line 132
    check-cast v3, La/p8i;

    .line 133
    .line 134
    invoke-virtual {v3}, La/p8i;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    move-object v12, p0

    .line 139
    check-cast v12, Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 140
    .line 141
    check-cast v2, La/p8i;

    .line 142
    .line 143
    invoke-virtual {v2}, La/p8i;->get()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    move-object v13, p0

    .line 148
    check-cast v13, La/hsd;

    .line 149
    .line 150
    check-cast v1, La/p8i;

    .line 151
    .line 152
    invoke-virtual {v1}, La/p8i;->get()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    move-object v14, p0

    .line 157
    check-cast v14, Lcom/google/firebase/perf/session/SessionManager;

    .line 158
    .line 159
    new-instance v7, La/sgq;

    .line 160
    .line 161
    invoke-direct/range {v7 .. v14}, La/sgq;-><init>(La/nfq;La/p5d0;La/dgq;La/p5d0;Lcom/google/firebase/perf/config/RemoteConfigManager;La/hsd;Lcom/google/firebase/perf/session/SessionManager;)V

    .line 162
    .line 163
    .line 164
    return-object v7

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
