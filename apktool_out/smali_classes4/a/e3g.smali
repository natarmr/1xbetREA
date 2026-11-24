.class public abstract La/e3g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/v0h0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/jyf;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, La/jyf;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/vlf;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-direct {v1, v2}, La/vlf;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, La/qxw;->L(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/v0h0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, La/e3g;->a:La/v0h0;

    .line 19
    .line 20
    return-void
.end method
