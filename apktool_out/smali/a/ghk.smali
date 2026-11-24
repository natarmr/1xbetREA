.class public final synthetic La/ghk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/hhk;

.field public final synthetic b:B

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/hhk;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ghk;->a:La/hhk;

    iput-byte p2, p0, La/ghk;->b:B

    iput-object p3, p0, La/ghk;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ghk;->a:La/hhk;

    .line 2
    .line 3
    iget-object v0, v0, La/hhk;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/s2c0;

    .line 6
    .line 7
    iget-byte v1, p0, La/ghk;->b:B

    .line 8
    .line 9
    iget-object p0, p0, La/ghk;->c:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0, v1, p0}, La/s2c0;->e(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
