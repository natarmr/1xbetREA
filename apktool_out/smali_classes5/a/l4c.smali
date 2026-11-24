.class public final La/l4c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/g4c;


# instance fields
.field public final a:La/s3c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/g4c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/l4c;->Companion:La/g4c;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILa/s3c;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, La/l4c;->a:La/s3c;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p0, La/e4c;->a:La/e4c;

    .line 13
    .line 14
    invoke-virtual {p0}, La/e4c;->getDescriptor()La/ugi0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0
.end method

.method public constructor <init>(La/s3c;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, La/l4c;->a:La/s3c;

    return-void
.end method
