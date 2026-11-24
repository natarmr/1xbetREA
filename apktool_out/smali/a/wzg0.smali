.class public final La/wzg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zkz;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/vzg0;

.field public c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;La/vzg0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wzg0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, La/wzg0;->b:La/vzg0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/kd30;La/glz;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, La/wzg0;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/wzg0;->c:Z

    .line 13
    .line 14
    invoke-virtual {p2, p0}, La/glz;->a(La/blz;)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, La/wzg0;->b:La/vzg0;

    .line 18
    .line 19
    iget-object p2, p2, La/vzg0;->b:La/w5z;

    .line 20
    .line 21
    iget-object p2, p2, La/w5z;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, La/ufd;

    .line 24
    .line 25
    iget-object p0, p0, La/wzg0;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, p0, p2}, La/kd30;->S(Ljava/lang/String;La/g0h0;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "Already attached to lifecycleOwner"

    .line 32
    .line 33
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final l(La/clz;La/kkz;)V
    .locals 1

    .line 1
    sget-object v0, La/kkz;->ON_DESTROY:La/kkz;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, La/wzg0;->c:Z

    .line 7
    .line 8
    invoke-interface {p1}, La/clz;->x()La/glz;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, La/glz;->f(La/blz;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
