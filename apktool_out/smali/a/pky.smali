.class public abstract La/pky;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/jru;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/art;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/jru;

    .line 7
    .line 8
    const/16 v2, 0x18

    .line 9
    .line 10
    invoke-direct {v1, v0, v2}, La/jru;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    sput-object v1, La/pky;->a:La/jru;

    .line 14
    .line 15
    return-void
.end method
