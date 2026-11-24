.class public abstract La/vso0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/dd40;

.field public static final b:La/dd40;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/dd40;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    sget-object v0, La/sre0;->a:La/tre0;

    .line 4
    .line 5
    const-class v1, La/eoo0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "camerax.tag_bundle"

    .line 12
    .line 13
    invoke-static {v1, v2}, La/g7x;->y(La/sgy;Ljava/lang/String;)La/dd40;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sput-object v1, La/vso0;->a:La/dd40;

    .line 18
    .line 19
    const-class v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "use_case_camera_state.tag"

    .line 26
    .line 27
    invoke-static {v0, v1}, La/g7x;->y(La/sgy;Ljava/lang/String;)La/dd40;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/vso0;->b:La/dd40;

    .line 32
    .line 33
    return-void
.end method
