.class public final La/i2a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/c1a;

.field public final b:La/erm0;

.field public final c:La/n0o0;


# direct methods
.method public constructor <init>(La/c1a;La/erm0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/i2a;->a:La/c1a;

    .line 8
    .line 9
    iput-object p2, p0, La/i2a;->b:La/erm0;

    .line 10
    .line 11
    new-instance p1, La/vb8;

    .line 12
    .line 13
    const/16 p2, 0x1d

    .line 14
    .line 15
    invoke-direct {p1, p0, p2}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/i2a;->c:La/n0o0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()La/kpd0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i2a;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kpd0;

    .line 8
    .line 9
    return-object p0
.end method
