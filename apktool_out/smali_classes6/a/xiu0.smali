.class public final La/xiu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/piu0;

.field public final b:Ljava/lang/Long;

.field public final c:Landroid/os/Bundle;

.field public final d:La/wbf;

.field public final e:La/miu0;

.field public final f:La/n0o0;


# direct methods
.method public constructor <init>(La/riu0;Ljava/lang/Long;Landroid/os/Bundle;La/wbf;La/miu0;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, La/riu0;->g()La/piu0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/xiu0;->a:La/piu0;

    .line 19
    .line 20
    iput-object p2, p0, La/xiu0;->b:Ljava/lang/Long;

    .line 21
    .line 22
    iput-object p3, p0, La/xiu0;->c:Landroid/os/Bundle;

    .line 23
    .line 24
    iput-object p4, p0, La/xiu0;->d:La/wbf;

    .line 25
    .line 26
    iput-object p5, p0, La/xiu0;->e:La/miu0;

    .line 27
    .line 28
    new-instance p1, La/rbt0;

    .line 29
    .line 30
    const/16 p2, 0xb

    .line 31
    .line 32
    invoke-direct {p1, p0, p2}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, La/xiu0;->f:La/n0o0;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a()La/wiu0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xiu0;->f:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wiu0;

    .line 8
    .line 9
    return-object p0
.end method
