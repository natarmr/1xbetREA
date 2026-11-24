.class public abstract La/ovb0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/u4d;

.field public static final b:F

.field public static final c:La/ugg0;

.field public static final d:La/u4d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/u4d;->j:La/u4d;

    .line 2
    .line 3
    sput-object v0, La/ovb0;->a:La/u4d;

    .line 4
    .line 5
    const/high16 v1, 0x40400000    # 3.0f

    .line 6
    .line 7
    sput v1, La/ovb0;->b:F

    .line 8
    .line 9
    invoke-static {v1}, La/vgg0;->a(F)La/ugg0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sput-object v1, La/ovb0;->c:La/ugg0;

    .line 14
    .line 15
    sget-object v1, La/u4d;->m:La/u4d;

    .line 16
    .line 17
    sget-object v1, La/kkj0;->a:La/kkj0;

    .line 18
    .line 19
    sput-object v0, La/ovb0;->d:La/u4d;

    .line 20
    .line 21
    sget-object v0, La/i1t0;->a:La/i1t0;

    .line 22
    .line 23
    return-void
.end method
