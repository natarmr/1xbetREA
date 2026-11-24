.class public final La/wzc0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:La/wzc0;

.field public static final b:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/wzc0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/wzc0;->a:La/wzc0;

    .line 7
    .line 8
    new-instance v0, La/cbc0;

    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/cbc0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La/wzc0;->b:La/n0o0;

    .line 20
    .line 21
    return-void
.end method
