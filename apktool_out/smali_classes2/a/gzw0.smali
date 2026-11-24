.class public abstract La/gzw0;
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
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-direct {v1, v2}, La/kmx;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/yzn0;

    .line 14
    .line 15
    const-string v3, "Phenotype.API"

    .line 16
    .line 17
    invoke-direct {v2, v3, v1, v0}, La/yzn0;-><init>(Ljava/lang/String;La/cwr0;La/qek0;)V

    .line 18
    .line 19
    .line 20
    sput-object v2, La/gzw0;->a:La/yzn0;

    .line 21
    .line 22
    return-void
.end method
