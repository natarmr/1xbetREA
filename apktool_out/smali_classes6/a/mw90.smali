.class public abstract La/mw90;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;

.field public static final b:La/ohd;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/wm90;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, La/wm90;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/zfn;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 11
    .line 12
    .line 13
    sput-object v1, La/mw90;->a:La/zfn;

    .line 14
    .line 15
    new-instance v0, La/ohd;

    .line 16
    .line 17
    const/16 v1, 0x11

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/ohd;-><init>(B)V

    .line 20
    .line 21
    .line 22
    sput-object v0, La/mw90;->b:La/ohd;

    .line 23
    .line 24
    return-void
.end method
