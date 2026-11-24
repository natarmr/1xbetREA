.class public final La/z8a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bmf0;


# instance fields
.field public final synthetic a:La/odd;


# direct methods
.method public constructor <init>(La/odd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z8a;->a:La/odd;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final q(La/cmf0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, La/ozw;

    .line 5
    .line 6
    const-string v0, "Capture request is cancelled because camera is closed"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-direct {p1, v2, v0, v1}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/z8a;->a:La/odd;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/odd;->b0(Ljava/lang/Throwable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final w(La/gnf0;JLa/qmf0;)V
    .locals 0

    .line 1
    new-instance p1, La/ozw;

    .line 2
    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string p3, "Capture request failed with reason "

    .line 6
    .line 7
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p4}, La/qmf0;->L()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const/4 p3, 0x0

    .line 22
    const/4 p4, 0x2

    .line 23
    invoke-direct {p1, p4, p2, p3}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/z8a;->a:La/odd;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/odd;->b0(Ljava/lang/Throwable;)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final y(La/gnf0;JLa/oz2;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/z8a;->a:La/odd;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method
