.class public final synthetic La/ga6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/y9q0;

.field public final synthetic b:La/k6z;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:La/j83;

.field public final synthetic e:La/w6k;

.field public final synthetic f:La/mrq;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(La/y9q0;La/k6z;Ljava/util/List;La/j83;La/w6k;La/mrq;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ga6;->a:La/y9q0;

    iput-object p2, p0, La/ga6;->b:La/k6z;

    iput-object p3, p0, La/ga6;->c:Ljava/util/List;

    iput-object p4, p0, La/ga6;->d:La/j83;

    iput-object p5, p0, La/ga6;->e:La/w6k;

    iput-object p6, p0, La/ga6;->f:La/mrq;

    iput-boolean p7, p0, La/ga6;->g:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, La/ga6;->a:La/y9q0;

    .line 2
    .line 3
    iget-object v1, p0, La/ga6;->b:La/k6z;

    .line 4
    .line 5
    iget-object v3, p0, La/ga6;->d:La/j83;

    .line 6
    .line 7
    iget-object v4, p0, La/ga6;->e:La/w6k;

    .line 8
    .line 9
    iget-object v5, p0, La/ga6;->f:La/mrq;

    .line 10
    .line 11
    iget-boolean v8, p0, La/ga6;->g:Z

    .line 12
    .line 13
    const-string v2, "BackgroundTextMeasurement"

    .line 14
    .line 15
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    instance-of v6, v2, La/nz40;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    check-cast v2, La/nz40;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v2, v7

    .line 31
    :goto_0
    if-eqz v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {v2, v7, v7}, La/nz40;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/nz40;

    .line 34
    .line 35
    .line 36
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 37
    if-eqz v9, :cond_2

    .line 38
    .line 39
    :try_start_1
    invoke-virtual {v9}, La/rfk0;->j()La/rfk0;

    .line 40
    .line 41
    .line 42
    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    :try_start_2
    invoke-static {v0, v1}, La/afn0;->A(La/y9q0;La/k6z;)La/y9q0;

    .line 44
    .line 45
    .line 46
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    iget-object p0, p0, La/ga6;->c:Ljava/util/List;

    .line 48
    .line 49
    if-nez p0, :cond_1

    .line 50
    .line 51
    :try_start_3
    sget-object p0, La/iun;->a:La/iun;

    .line 52
    .line 53
    :cond_1
    move-object v7, p0

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    goto :goto_2

    .line 58
    :goto_1
    new-instance v2, La/w5z;

    .line 59
    .line 60
    invoke-direct/range {v2 .. v8}, La/w5z;-><init>(La/j83;La/w6k;La/mrq;La/y9q0;Ljava/util/List;Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, La/w5z;->e()F

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, La/w5z;->f()F
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    .line 68
    .line 69
    :try_start_4
    invoke-static {v10}, La/rfk0;->q(La/rfk0;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 70
    .line 71
    .line 72
    :try_start_5
    invoke-virtual {v9}, La/nz40;->w()La/wdx;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, La/wdx;->L()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9}, La/nz40;->c()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 80
    .line 81
    .line 82
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :catchall_1
    move-exception v0

    .line 87
    move-object p0, v0

    .line 88
    goto :goto_3

    .line 89
    :goto_2
    :try_start_6
    invoke-static {v10}, La/rfk0;->q(La/rfk0;)V

    .line 90
    .line 91
    .line 92
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 93
    :goto_3
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 94
    :catchall_2
    move-exception v0

    .line 95
    move-object p0, v0

    .line 96
    :try_start_8
    invoke-virtual {v9}, La/nz40;->c()V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :catchall_3
    move-exception v0

    .line 101
    move-object p0, v0

    .line 102
    goto :goto_4

    .line 103
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    const-string v0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 106
    .line 107
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 111
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 112
    .line 113
    .line 114
    throw p0
.end method
