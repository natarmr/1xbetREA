.class public abstract La/mhl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/wez;->b:La/wez;

    .line 2
    .line 3
    new-instance v1, La/xal;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/xal;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/mhl;->a:La/a8z;

    .line 15
    .line 16
    return-void
.end method
