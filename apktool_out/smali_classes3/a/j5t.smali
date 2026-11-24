.class public final La/j5t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Z

.field public final B:La/k050;

.field public final a:La/qoj0;

.field public b:Z

.field public c:La/vrs;

.field public d:Z

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Ljava/util/HashMap;

.field public i:Ljava/util/HashMap;

.field public j:Ljava/util/HashMap;

.field public k:La/dqr;

.field public final l:Ljava/util/LinkedHashMap;

.field public final m:Ljava/util/ArrayList;

.field public n:D

.field public o:D

.field public p:La/csr;

.field public q:La/ql5;

.field public r:La/ql5;

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:D

.field public x:Z

.field public y:Z

.field public z:La/y5s;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x5

    .line 6
    const/4 v2, 0x0

    .line 7
    const v3, 0x7fffffff

    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3, v0, v1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/j5t;->a:La/qoj0;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, La/j5t;->b:Z

    .line 18
    .line 19
    sget-object v1, La/vrs;->a:La/vrs;

    .line 20
    .line 21
    iput-object v1, p0, La/j5t;->c:La/vrs;

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    iput v1, p0, La/j5t;->e:I

    .line 25
    .line 26
    new-instance v1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, La/j5t;->h:Ljava/util/HashMap;

    .line 32
    .line 33
    new-instance v1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, La/j5t;->i:Ljava/util/HashMap;

    .line 39
    .line 40
    new-instance v1, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, La/j5t;->j:Ljava/util/HashMap;

    .line 46
    .line 47
    new-instance v2, La/dqr;

    .line 48
    .line 49
    const-wide/16 v5, 0x0

    .line 50
    .line 51
    const-wide/16 v7, 0x0

    .line 52
    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    invoke-direct/range {v2 .. v8}, La/dqr;-><init>(DDD)V

    .line 56
    .line 57
    .line 58
    iput-object v2, p0, La/j5t;->k:La/dqr;

    .line 59
    .line 60
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, La/j5t;->l:Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    new-instance v1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, La/j5t;->m:Ljava/util/ArrayList;

    .line 73
    .line 74
    sget-object v1, La/csr;->e:La/csr;

    .line 75
    .line 76
    iput-object v1, p0, La/j5t;->p:La/csr;

    .line 77
    .line 78
    iput-boolean v0, p0, La/j5t;->s:Z

    .line 79
    .line 80
    iput-boolean v0, p0, La/j5t;->x:Z

    .line 81
    .line 82
    sget-object v0, La/y5s;->i:La/y5s;

    .line 83
    .line 84
    iput-object v0, p0, La/j5t;->z:La/y5s;

    .line 85
    .line 86
    new-instance v0, La/k050;

    .line 87
    .line 88
    invoke-direct {v0}, La/k050;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, La/j5t;->B:La/k050;

    .line 92
    .line 93
    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, " = "

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "GamesProcess.Flag"

    .line 19
    .line 20
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final b(DJ)V
    .locals 2

    .line 1
    iget-object v0, p0, La/j5t;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/j5t;->h:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Double;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p1, "firstFastBet"

    .line 37
    .line 38
    invoke-static {p0, p1}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final c(DJ)V
    .locals 2

    .line 1
    iget-object v0, p0, La/j5t;->i:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/j5t;->i:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Double;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p1, "secondFastBet"

    .line 37
    .line 38
    invoke-static {p0, p1}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final d(DJ)V
    .locals 2

    .line 1
    iget-object v0, p0, La/j5t;->j:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/j5t;->j:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Double;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string p1, "thirdFastBet"

    .line 37
    .line 38
    invoke-static {p0, p1}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method
