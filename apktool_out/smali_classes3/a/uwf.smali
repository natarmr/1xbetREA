.class public final La/uwf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vby;

.field public final b:La/n0o0;

.field public final c:La/n0o0;


# direct methods
.method public constructor <init>(La/vby;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uwf;->a:La/vby;

    .line 5
    .line 6
    new-instance p1, La/qwf;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, p0, v0}, La/qwf;-><init>(La/uwf;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La/uwf;->b:La/n0o0;

    .line 17
    .line 18
    new-instance p1, La/dpf;

    .line 19
    .line 20
    invoke-direct {p1, p0}, La/dpf;-><init>(La/uwf;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, La/uwf;->c:La/n0o0;

    .line 28
    .line 29
    return-void
.end method
