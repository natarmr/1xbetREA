.class public final La/wu5;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:La/vzg0;

.field public final d:La/xae0;

.field public final e:La/p7m0;


# direct methods
.method public constructor <init>(La/i1w0;La/vzg0;La/c8c;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/wu5;->b:La/i1w0;

    .line 8
    .line 9
    iput-object p2, p0, La/wu5;->c:La/vzg0;

    .line 10
    .line 11
    const-string p1, "KEY_CAMERA_PERMISSION_REQUESTED"

    .line 12
    .line 13
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p2, p3, p1}, La/vzg0;->c(Ljava/lang/Object;Ljava/lang/String;)La/xae0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, La/wu5;->d:La/xae0;

    .line 20
    .line 21
    sget-object p1, La/nu5;->a:La/nu5;

    .line 22
    .line 23
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, La/wu5;->e:La/p7m0;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 4

    .line 1
    iget-object p0, p0, La/wu5;->b:La/i1w0;

    .line 2
    .line 3
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/c8d;

    .line 8
    .line 9
    sget-object v2, La/y7d;->a:La/v7d;

    .line 10
    .line 11
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    move-object v1, v0

    .line 22
    check-cast v1, La/paw;

    .line 23
    .line 24
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/oe50;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    iget-object v0, p0, La/wu5;->d:La/xae0;

    .line 2
    .line 3
    iget-object v0, v0, La/xae0;->a:La/n7m0;

    .line 4
    .line 5
    invoke-interface {v0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/wu5;->e:La/p7m0;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    sget-object v1, La/ou5;->a:La/ou5;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
