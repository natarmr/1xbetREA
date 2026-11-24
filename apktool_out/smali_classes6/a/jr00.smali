.class public abstract La/jr00;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/n0o0;

.field public static final b:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/x800;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/x800;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, La/jr00;->a:La/n0o0;

    .line 13
    .line 14
    new-instance v0, La/x800;

    .line 15
    .line 16
    const/16 v1, 0x11

    .line 17
    .line 18
    invoke-direct {v0, v1}, La/x800;-><init>(B)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/zfn;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 25
    .line 26
    .line 27
    sput-object v1, La/jr00;->b:La/zfn;

    .line 28
    .line 29
    return-void
.end method
