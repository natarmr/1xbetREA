.class public abstract La/q44;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/qek0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/kmx;

    .line 7
    .line 8
    const/4 v2, 0x7

    .line 9
    invoke-direct {v1, v2}, La/kmx;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v2, La/yzn0;

    .line 13
    .line 14
    const-string v3, "Auth.GOOGLE_SIGN_IN_API"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1, v0}, La/yzn0;-><init>(Ljava/lang/String;La/cwr0;La/qek0;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, La/q44;->a:La/yzn0;

    .line 20
    .line 21
    return-void
.end method
