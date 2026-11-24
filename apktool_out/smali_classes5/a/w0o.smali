.class public final La/w0o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
    with = La/x0o;
.end annotation


# static fields
.field public static final Companion:La/v0o;


# instance fields
.field public final a:Ljava/lang/Integer;

.field public final b:La/i2o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/v0o;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/w0o;->Companion:La/v0o;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;La/i2o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/w0o;->a:Ljava/lang/Integer;

    .line 5
    .line 6
    iput-object p2, p0, La/w0o;->b:La/i2o;

    .line 7
    .line 8
    return-void
.end method
