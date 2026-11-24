.class public abstract La/zwv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/v0h0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/i9v0;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/i9v0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/ejv0;

    .line 9
    .line 10
    const/16 v2, 0x14

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/ejv0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, La/x8x;->t(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/v0h0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La/zwv0;->a:La/v0h0;

    .line 20
    .line 21
    return-void
.end method
