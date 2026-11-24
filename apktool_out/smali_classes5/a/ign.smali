.class public final La/ign;
.super La/hgn;
.source "SourceFile"


# static fields
.field public static final b:La/ign;

.field public static final c:La/ign;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ign;

    .line 2
    .line 3
    const/high16 v1, 0x43900000    # 288.0f

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/hgn;-><init>(F)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/ign;->b:La/ign;

    .line 9
    .line 10
    new-instance v0, La/ign;

    .line 11
    .line 12
    const/high16 v1, 0x43c80000    # 400.0f

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/hgn;-><init>(F)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/ign;->c:La/ign;

    .line 18
    .line 19
    return-void
.end method
