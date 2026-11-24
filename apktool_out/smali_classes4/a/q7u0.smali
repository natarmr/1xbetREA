.class public final La/q7u0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/s1p;


# direct methods
.method public constructor <init>(La/s1p;)V
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
    iput-object p1, p0, La/q7u0;->a:La/s1p;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    const-string v1, "verification"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/j1p;

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    invoke-direct {v1, p1, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 13
    .line 14
    .line 15
    new-array p1, v3, [La/k1p;

    .line 16
    .line 17
    aput-object v0, p1, v2

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    aput-object v1, p1, v0

    .line 21
    .line 22
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p0, p0, La/q7u0;->a:La/s1p;

    .line 27
    .line 28
    const-wide/16 v0, 0xbe3

    .line 29
    .line 30
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
