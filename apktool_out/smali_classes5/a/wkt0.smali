.class public final La/wkt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/l1u;

.field public final b:La/pbt;


# direct methods
.method public constructor <init>(La/l1u;La/pbt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/wkt0;->a:La/l1u;

    .line 8
    .line 9
    iput-object p2, p0, La/wkt0;->b:La/pbt;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(D)V
    .locals 3

    .line 1
    iget-object v0, p0, La/wkt0;->a:La/l1u;

    .line 2
    .line 3
    invoke-virtual {v0}, La/l1u;->a()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    cmpl-double v0, p1, v0

    .line 8
    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, La/wkt0;->b:La/pbt;

    .line 12
    .line 13
    iget-object p0, p0, La/pbt;->a:La/j5t;

    .line 14
    .line 15
    iget-object v0, p0, La/j5t;->k:La/dqr;

    .line 16
    .line 17
    iget-wide v0, v0, La/dqr;->a:D

    .line 18
    .line 19
    cmpg-double v2, p1, v0

    .line 20
    .line 21
    if-gez v2, :cond_0

    .line 22
    .line 23
    move-wide p1, v0

    .line 24
    :cond_0
    iput-wide p1, p0, La/j5t;->w:D

    .line 25
    .line 26
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string p1, "lastBetForMultiChoiceGame"

    .line 31
    .line 32
    invoke-static {p0, p1}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method
