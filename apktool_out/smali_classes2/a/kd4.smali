.class public final La/kd4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/i1w0;

.field public final b:La/mi70;

.field public final c:La/zn00;


# direct methods
.method public constructor <init>(La/i1w0;La/svs0;La/mi70;La/zn00;La/kwd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/kd4;->a:La/i1w0;

    .line 5
    .line 6
    iput-object p3, p0, La/kd4;->b:La/mi70;

    .line 7
    .line 8
    iput-object p4, p0, La/kd4;->c:La/zn00;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/c8d;

    .line 7
    .line 8
    sget-object v2, La/y7d;->a:La/v7d;

    .line 9
    .line 10
    sget-object v3, La/m0w0;->a:La/m0w0;

    .line 11
    .line 12
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    iget-object p0, p0, La/kd4;->a:La/i1w0;

    .line 17
    .line 18
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    move-object v1, v0

    .line 23
    check-cast v1, La/paw;

    .line 24
    .line 25
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/oe50;

    .line 36
    .line 37
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void
.end method
