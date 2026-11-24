.class public final synthetic La/sj1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/pru;

.field public final synthetic b:La/iqt;

.field public final synthetic c:J

.field public final synthetic d:La/ctf0;

.field public final synthetic e:J

.field public final synthetic f:I

.field public final synthetic g:La/rj1;


# direct methods
.method public synthetic constructor <init>(La/pru;La/iqt;JLa/ctf0;JILa/rj1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sj1;->a:La/pru;

    iput-object p2, p0, La/sj1;->b:La/iqt;

    iput-wide p3, p0, La/sj1;->c:J

    iput-object p5, p0, La/sj1;->d:La/ctf0;

    iput-wide p6, p0, La/sj1;->e:J

    iput p8, p0, La/sj1;->f:I

    iput-object p9, p0, La/sj1;->g:La/rj1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-object v0, p0, La/sj1;->a:La/pru;

    .line 2
    .line 3
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 4
    .line 5
    .line 6
    move-result-object v13

    .line 7
    iget-object v0, p0, La/sj1;->b:La/iqt;

    .line 8
    .line 9
    iget-object v0, v0, La/iqt;->a:La/gst0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v7

    .line 15
    iget-wide v0, p0, La/sj1;->c:J

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, La/nw80;->f1:La/c0o;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, La/u1;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v3}, La/b3;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, La/nw80;

    .line 47
    .line 48
    invoke-virtual {v4}, La/nw80;->getId()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    cmp-long v4, v4, v0

    .line 53
    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 58
    :goto_1
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    :goto_2
    move-wide v2, v0

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    sget-object v0, La/nw80;->t:La/nw80;

    .line 67
    .line 68
    invoke-virtual {v0}, La/nw80;->getId()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    goto :goto_2

    .line 73
    :goto_3
    const/4 v0, 0x0

    .line 74
    new-array v1, v0, [Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v4, p0, La/sj1;->d:La/ctf0;

    .line 77
    .line 78
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 79
    .line 80
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const v1, 0x7f1301bc

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    iget-object v0, v13, La/sff0;->b:La/hl1;

    .line 92
    .line 93
    iget-boolean v10, v0, La/hl1;->C:Z

    .line 94
    .line 95
    new-instance v1, La/j8d0;

    .line 96
    .line 97
    sget-object v11, La/d8d0;->a:La/d8d0;

    .line 98
    .line 99
    sget-object v12, La/xun;->a:La/xun;

    .line 100
    .line 101
    iget-wide v4, p0, La/sj1;->e:J

    .line 102
    .line 103
    iget v8, p0, La/sj1;->f:I

    .line 104
    .line 105
    iget-object v9, p0, La/sj1;->g:La/rj1;

    .line 106
    .line 107
    const/4 v14, 0x0

    .line 108
    invoke-direct/range {v1 .. v14}, La/j8d0;-><init>(JJLjava/lang/String;ZILa/rj1;ZLa/e8d0;Ljava/util/Set;La/sff0;La/fk80;)V

    .line 109
    .line 110
    .line 111
    return-object v1
.end method
