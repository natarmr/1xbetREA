.class public abstract La/l0h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/inv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/jsm0;->a:La/jsm0;

    .line 2
    .line 3
    invoke-static {v0}, La/mrv;->o0(La/jsm0;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 7
    .line 8
    sget-object v1, La/chi0;->Companion:La/bhi0;

    .line 9
    .line 10
    invoke-virtual {v1}, La/bhi0;->serializer()La/jiy;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, La/mrv;->N(La/jiy;La/jiy;)La/inv;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, La/l0h0;->a:La/inv;

    .line 19
    .line 20
    return-void
.end method
