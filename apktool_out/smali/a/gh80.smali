.class public final La/gh80;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:La/gh80;

.field public static final b:La/fh80;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/gh80;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/gh80;->a:La/gh80;

    .line 7
    .line 8
    new-instance v0, La/fh80;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/16 v2, 0xf

    .line 12
    .line 13
    invoke-direct {v0, v1, v1, v2}, La/fh80;-><init>(FFI)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/gh80;->b:La/fh80;

    .line 17
    .line 18
    return-void
.end method
