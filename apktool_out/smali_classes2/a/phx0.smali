.class public abstract La/phx0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/vgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/vgx0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "do_not_log_to_logcat"

    .line 5
    .line 6
    const-class v3, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-direct {v0, v2, v3, v1, v1}, La/vgx0;-><init>(Ljava/lang/String;Ljava/lang/Class;ZZ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/phx0;->a:La/vgx0;

    .line 12
    .line 13
    return-void
.end method
