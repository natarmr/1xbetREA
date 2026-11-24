.class public final La/f2v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kgr0;


# direct methods
.method public constructor <init>(La/kgr0;)V
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
    iput-object p1, p0, La/f2v;->a:La/kgr0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(J)La/i89;
    .locals 0

    .line 1
    iget-object p0, p0, La/f2v;->a:La/kgr0;

    .line 2
    .line 3
    iget-object p0, p0, La/kgr0;->a:La/jgr0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/jgr0;->a(J)La/p7m0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance p1, La/i89;

    .line 10
    .line 11
    const/16 p2, 0x16

    .line 12
    .line 13
    invoke-direct {p1, p0, p2}, La/i89;-><init>(La/gmq;B)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method
